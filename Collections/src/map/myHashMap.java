package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class myHashMap {

    public static void main(String[] args) {

        //Hashmap doesn't preserve order of input
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(5,"Five");
        map.put(8,"Eight");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");

        //If the key doesn't exist then it's value is null
        String text = map.get(0);
        System.out.println(text);//Prints null

        //If same item is put twice then the second value will replace the previous one
        map.put(2,"Hello");
        System.out.println(map.get(2));//Prints Hello


        //Iterating through all key & values
        for(java.util.Map.Entry<Integer,String> entry: map.entrySet()) // Every Key,Value pair is a Map.Entry
        {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);

        }

        System.out.println("-----------------------");
        Set<Integer> keys = map.keySet();
        for(Integer i: keys) {
            System.out.println(i + " " + map.get(i));
        }


        System.out.println("-----------------------");
        Set<Map.Entry<Integer, String>> mapEntrySet = map.entrySet();
        for(Map.Entry<Integer, String> e: mapEntrySet) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

}
