package data;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class QueueDataStructure {

    /*
    * Example of PriorityQueue. Works of FIFO manner.
    * */
    public static void queueExamples() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Bala");
        queue.add("Basta");
        queue.add("Last");
        System.out.println("Initial state: " + queue);

        System.out.println("The head is (element): " + queue.element()); // throw exception if empty
        System.out.println("The head is (peek): " + queue.peek()); // return null if queue is empty
        System.out.println("The head is (remove): " + queue.remove()); // throw exception if queue if empty
        System.out.println("The head is (poll): " + queue.poll()); // return null if empty
        System.out.println("Current state: " + queue);

        // iterating
        for (String el : queue) {
            System.out.println("Iteration: " + el);
        }
    }
}
