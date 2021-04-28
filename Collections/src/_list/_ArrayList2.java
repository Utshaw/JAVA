package _list;

import java.util.ArrayList;
import java.util.Collections;

public class _ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>();
        ArrayList<String> allTasks = new ArrayList<>();


        urgentTasks.add("Study English");
        urgentTasks.add("Study Math");
        urgentTasks.add("Study Bengali");

        allTasks.addAll(urgentTasks);

        Collections.sort(allTasks); // alphabetic order
        Collections.sort(allTasks, Collections.reverseOrder()); // reverse alphabetic order

        System.out.println(allTasks);

        System.out.println(allTasks.contains("Study English"));

        System.out.println(allTasks.subList(0, 1));

        Collections.shuffle(allTasks); // shuffle the list


    }
}
