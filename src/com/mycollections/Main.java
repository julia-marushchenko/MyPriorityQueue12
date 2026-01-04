/**
 * Java program to use toArray() method for Queue.
 */

package com.mycollections;

import java.util.*;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a queue of Student
        Queue<String> myQueue = new PriorityQueue<>();

        // Adding elements to myQueue
        myQueue.add("Freiberg");
        myQueue.add("Stuttgart");
        myQueue.add("Ludwigsburg");
        myQueue.add("Kornwestheim");

        // Printing the myQueue to console.
        System.out.println(myQueue);

        // Using toArray() method
        String arr [] = new String[myQueue.size()];
        String arr1 [] = myQueue.toArray(arr);

        // Printing the array arr to console
        System.out.println("arr[]: ");
        for (int index = 0; index < arr.length; index++) {

            System.out.println(arr[index]);

        }

        // Printing the array arr1 to console
        System.out.println("arr1[]: ");
        for (int index = 0; index < arr1.length; index++) {

            System.out.println(arr1[index]);

        }
    }
}