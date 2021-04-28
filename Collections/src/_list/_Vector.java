package _list;

import java.util.Vector;

public class _Vector {
    // Vector thread safe
    public static void main(String[] args) {
        Vector<String> toDoVectors = new Vector<>();

        toDoVectors.add("Farhan");
        toDoVectors.add("Tanvir");
        toDoVectors.add("Utshaw");

        System.out.println(toDoVectors);

        System.out.println(toDoVectors.firstElement());
        System.out.println(toDoVectors.lastElement());
    }
}
