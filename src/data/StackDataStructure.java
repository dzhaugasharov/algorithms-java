package data;

import java.util.Stack;

public class StackDataStructure {

    /*
     * Stack based on LIFO (Last-In-First-Out).
     * Extends Vector class and implements Iterable, Collection, List
     * */
    public static void stackData() {

        Stack<String> stack = new Stack<>();
        System.out.println("Is stack empty? " + stack.empty());

        // pushing data
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // peek - just show last element but does not remove
        System.out.println("peek: " + stack.peek());

        // pop - returns and removes last pushed element
        System.out.println("pop: " + stack.pop());

        System.out.println("Current state: " + stack);

        // searching - return the order starting from top
        System.out.println("if not exits, returns: " + stack.search("None existing"));
        System.out.println("" + stack.search("Element 1"));

        // iterating
        for (String el : stack) {
            System.out.println("Iteration: " + el);
        }
    }
}
