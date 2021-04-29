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

        System.out.println("----------------------------------------");
        MyClass<Integer> myClass = new MyClass<>(10);
        myClass.showClass();

        MyClass<Double> myClass2 = new MyClass<>(10.123);
        myClass2.showClass();

        NumericFns<Integer> numericFns = new NumericFns<>(10);
        System.out.println(numericFns.square());

        NumericFns<Double> numericFns2 = new NumericFns<>(10.0);
        System.out.println(numericFns.absEqual(numericFns2));


    }
}
