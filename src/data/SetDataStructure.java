package data;

import java.util.HashSet;
import java.util.Set;

public class SetDataStructure {

    /*
    * HashSet stores the elements by using a mechanism called hashing.
    * HashSet contains unique elements only.
    * HashSet allows null value.
    * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
    * HashSet is the best approach for search operations.
    * The initial default capacity of HashSet is 16, and the load factor is 0.75.
    * */
    public static void setExamples() {

        Set<String> set = new HashSet<>();

        set.add("Value 1");
        set.add("Value 2");
        set.add("Value 3");
        set.add("Value 3");
        set.add(null);

        System.out.println("Current state: " + set);

        System.out.println("Contains Value 1: " + set.contains("Value 1"));
        System.out.println("Remove Value 1: " + set.remove("Value 1"));

        for (String el : set) {
            System.out.println("Iteration: " + el);
        }

    }
}
