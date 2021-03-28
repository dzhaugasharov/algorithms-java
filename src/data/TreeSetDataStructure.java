package data;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDataStructure {

    /*
    * Java TreeSet class contains unique elements only like HashSet.
    * Java TreeSet class access and retrieval times are quiet fast.
    * Java TreeSet class doesn't allow null element.
    * Java TreeSet class is non synchronized.
    * Java TreeSet class maintains ascending order.
    * */
    public static void treeSetExample() {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Value 1");
        treeSet.add("Value 2");
        treeSet.add("Value 3");
        // treeSet.add(null); - not allowed

        // iteration - maintains order
        for (String el : treeSet) {
            System.out.println("Iteration: " + el);
        }
    }
}
