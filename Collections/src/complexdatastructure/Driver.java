package complexdatastructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Driver {

    public static String[] vehicles = {"ambulence","helicopter","lifeboat"};

    public static String[][] drivers = {
            {"A","B"},
            {"C","D","E","F"},
            {"G"}
    };


    public static void main(String[] args) {

        Map<String,Set<String>> myMap = new HashMap<>();

        for(int i=0;i<vehicles.length;i++)
        {
            String vehicle = vehicles[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            String[] driver = drivers[i];

            for(String aDriver : driver)
            {
                driverSet.add(aDriver);
            }

            myMap.put(vehicle,driverSet);

        }


        for(Map.Entry<String,Set<String>> entry: myMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
