package _generics;

import java.util.ArrayList;

public class GenericsApp {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setTypeData(100);
        System.out.println(box.getTypeData());

        Utils.displayToString(box);

        OrderedPair<Integer, String> orderedPair = new OrderedPair<>(105, "Farhan");
        System.out.println(orderedPair);


        ArrayList<OrderedPair<String, String>> orderedPairs = new ArrayList<>();
        orderedPairs.add(new OrderedPair<>("105", "F"));



    }
}
