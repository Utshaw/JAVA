package arraylist;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding element
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        //Retrieving element by index
        System.out.println(numbers.get(0)); // get(int index)

        //iteration by indexed for loop
        System.out.println("Iteration #1: ");
        for(int i=0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }

        //Iteration using for each loop
        System.out.println("\nIteration #2");
        for(Integer number : numbers)
        {
            System.out.println(number);
        }

        //Removing an element by index
        try
        {
            numbers.remove(100);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Error on remove operation: Index is out of the range");
        }
    }
}
