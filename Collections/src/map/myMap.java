package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class myMap {

    public static void main(String[] args) {

        /*
        HashMap doesn't preserve order
        LinedHashMap preserve order as they get input in the map
        TreeMap  is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
         */

        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap = new TreeMap<Integer, String>();
        testMap(treeMap);

    }

    public static void testMap(Map<Integer,String> map)
    {
        map.put(9,"fox");
        map.put(4,"cat");
        map.put(8,"dog");
        map.put(1,"giraffe");
        map.put(0,"swan");
        map.put(15,"bear");
        map.put(6,"snake");

        for(Integer key : map.keySet())
        {
            String value = map.get(key);
            System.out.println(key + ":  " +value);
        }
    }
}
