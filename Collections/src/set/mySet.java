package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class mySet {

    public static void main(String[] args) {
        /*
        HashSet doesnot remember the order or doesn't follow any order
        LinkedHashSet remembers order
        TreeSet sorts in natural order
         */
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();

//        testSet(hashSet);

//        System.out.println(hashSet);//This also prints the elements


        hashSet.add("dog");
        hashSet.add("cat");
        hashSet.add("mouse");
        hashSet.add("bear");

        linkedHashSet.add("dog");
        linkedHashSet.add("cat");
        linkedHashSet.add("giraffe");

        Set<String> intersectionSet = intersection(hashSet,linkedHashSet);
        System.out.println(hashSet + " Intersect " + linkedHashSet +": "+intersectionSet);

        Set<String> differenceSet = difference(hashSet,linkedHashSet);

        System.out.println(hashSet + " Minus " + linkedHashSet +": "+differenceSet);
    }

    private static void testSet(Set<String> mySet) {
        //isEmpty()
        if (mySet.isEmpty())
            System.out.println("Set is empty");


        mySet.add("dog");
        mySet.add("cat");
        mySet.add("mouse");
        mySet.add("bear");

        //Adding duplicate item does nothing new
        mySet.add("mouse");//No effect

        for (String element : mySet) {
            System.out.println(element);
        }

        //contains()
        if (mySet.contains("aardverk")) {
            System.out.println("Contains aardverk");
        }
        if (mySet.contains("cat"))
            System.out.println("Contains cat");

    }

    private  static Set<String> intersection(Set<String> set1,Set<String> set2)
    {
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        return  intersection;
    }

    private static Set<String> difference(Set<String> set1,Set<String> set2)
    {
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        return difference;
    }
}
