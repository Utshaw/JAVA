package equals_hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Reference: https://www.youtube.com/watch?v=ghswNpRv2t0
           https://www.youtube.com/watch?v=7V3589CReug
           https://javaranch.com/journal/2002/10/equalhash.html
*/


class Student
{
    private String registrationNumber;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /*
     if one object equals the other, their hashcode must be same
     The converse is not necessarily true.
     */

    /*
   primitives can be compared directly with an equality operator (==) after performing any necessary conversions
   (Such as float to Float.floatToIntBits or double to Double.doubleToLongBits).
   Whereas, object references can be compared by invoking their equals method recursively.
   You also need to ensure that invoking the equals method on these object references does not result in a NullPointerException.
 */

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() == this.getClass()) // This is preferred over instanceof operator
        {
            Student test = (Student)obj;
            if(this.registrationNumber.equals(test.registrationNumber))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return registrationNumber != null ? registrationNumber.hashCode() : 0;
    }
}

class ReportCard
{
    private int mathScore;

    public ReportCard() {
        this.mathScore = (int)(Math.random()*101+1);
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}

public class myEqualsHashCode {

    public static void main(String[] args) {
        Student s = new Student("H234");
        Student s2 = new Student("H234");

        Map<Student,ReportCard> studentMap = new HashMap<Student,ReportCard>();
        studentMap.put(s,new ReportCard());
        studentMap.put(s2,new ReportCard());
        System.out.println(studentMap.size());
    }


}
