package _list;

import java.util.ArrayList;

public class _ArrayList {
  // ArrayList not thread safe

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Earbud", "Comfortable, clear sound", 19.99));
        products.add(new Product("AirPod", "Comfortable, clear sound", 59.99));

        // add at idx 1, shift right previous elements
        products.add(1, new Product("iPad", "Larger display", 1200.99));


        // change the 0th element
        products.set(0, new Product("Rubber Duck", "Yellow ducks", 5.99)); 

        // remote element at idx 0
       products.remove(0); 

         // remove Rubber Duck product
       products.remove(new Product("Rubber Duck", "Yellow ducks", 5.99));

        System.out.println(products);
    }
}
