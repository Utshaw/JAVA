package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _LinkedList {

    public static void main(String[] args) {
        LinkedList<String> lists = new LinkedList<>();

        lists.add("Farhan");
        lists.add(1, "Tanvir");
        lists.add("Utshaw");
        lists.push("HELLO"); // add to the first
        lists.offer("LAST"); // add to the last

        System.out.println(lists);
        System.out.println(lists.pop()); // returns first element & removes it

        System.out.println(lists.getFirst());
        System.out.println(lists.peekFirst());
    }


}
