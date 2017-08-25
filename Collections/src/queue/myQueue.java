package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class myQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3); // initialize the capacity

        queue.add(1);
        queue.add(2);
        queue.add(3);

        try
        {
            queue.add(4);
        }
        catch (IllegalStateException e)
        {
            System.out.println("Tried to add too many items to the queue");
        }

        System.out.println(queue.peek());
        for(Integer element : queue)
        {
            System.out.println("Peek element is :" +element);
        }

        queue.remove();
        queue.remove();
        queue.remove();

        try
        {
            queue.remove();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Tried to remove too many elements");
        }
    }
}
