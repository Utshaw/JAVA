package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Reference: https://www.youtube.com/watch?v=QYvUmIYgsiA&index=7&list=PLB841C370FAFB8EC7

public class Driver {
    public static void main(String[] args) {
        String str1 = "Utshaw";
        String str2 = "Farhan";
        String str3 = "Tanvir";

        List<String> myList = new ArrayList<String>();
        myList.add(str1);
        myList.add(str2);
        myList.add(str3);

        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareToIgnoreCase(o2); // Reverse alphabetical order
            }
        });


        for(String name: myList)
            System.out.println(name);

    }
}
