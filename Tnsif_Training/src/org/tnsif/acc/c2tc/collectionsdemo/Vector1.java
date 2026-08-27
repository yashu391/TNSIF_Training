package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.Vector;
import java.util.List;

public class Vector1 {

    public static void main(String[] args) {

        // Creating Vector
        List<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Dragon");

        System.out.println(fruits);

        // Accessing element
        System.out.println("Second Fruit: " + fruits.get(1));

        // Updating element
        fruits.set(1, "Cherry");
        System.out.println(fruits);

        // Removing element
        fruits.remove(2);
        System.out.println("After removing: " + fruits);

        // Checking element
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list");
        } else {
            System.out.println("Mango is not in the list");
        }

        // Using Iterable for traversal
        Iterable<String> iterableFruits = fruits;

        System.out.println("Traversing using Iterable:");
        for (String fruit : iterableFruits) {
            System.out.println(fruit);
        }

        // Using enhanced for-each loop
        System.out.println("Traversing using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}