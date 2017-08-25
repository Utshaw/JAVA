package iterable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class myIterable {

    public static void main(String[] args) {
        List<String> myList = new LinkedList<String>();
        myList.add("cat");
        myList.add("dog");
        myList.add("giraffe");
        myList.add("crocodile");

        Iterator<String> myIterator = myList.iterator();
        while(myIterator.hasNext())
        {
            String value = myIterator.next();
            System.out.println(value);

            if(value.equals("cat"))
                myIterator.remove();
        }

        System.out.println("#########################################");
        for(String element : myList)
        {
            System.out.println(element);
        }
    }
}
