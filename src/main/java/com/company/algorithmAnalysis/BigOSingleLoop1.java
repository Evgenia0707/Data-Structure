package com.company.algorithmAnalysis;

public class BigOSingleLoop1 {

    public static void main(String[] args) {

        long numberOfOperations = 0;

        int n = 100;//size of data
        int m = 500;

        long startTime;//running time
        long endTime;

        System.out.println("Input size n is = " + n);

// Task 1 Single Loop...................O(n)

        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");
//Number of operations: 100 in 0 milliseconds
        System.out.println("__________________________________________________________________");

// Task 2 Nested Loops...................data size n

        numberOfOperations = 0;

        startTime = System.currentTimeMillis();

        for (int j = 0; j < n; j++) {//run n times

            for (int i = 0; i < n; i++) {//run n times
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");
//Number of operations with nested loop: 10000 in 0 milliseconds

        // Task 2 End...................
        System.out.println("________________________________________________________________");

// Task 3 Triple Nested Loops...................
        numberOfOperations = 0;

        startTime = System.currentTimeMillis();

        for (int j = 0; j < n; j++) {//run n times
            for (int i = 0; i < n; i++) {//run n times
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }

        endTime = System.currentTimeMillis();
        System.out.println("Triple Number of operations with nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 3 End...................
        System.out.println("__________________________________________________________________");

// Task 4 N and M Nested Loops...O(n*m)................

        numberOfOperations = 0;

        startTime = System.currentTimeMillis();

        for (int j = 0; j < n; j++) {//run n times

            for (int i = 0; i < m; i++) {//run n times
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Nested Loop (n* m) Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        System.out.println("____________________________________________________________________________");

// ask 4.5 N and M Consecutive Loops O(n+m).......

        numberOfOperations = 0;

        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations += 1;
        }
        for (int i = 0; i < m; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Consecutive Loops O(n+m) Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");
        // Task 4.5 End...................

        System.out.println("_________________________________________________________________________");

// Task 5 Logarithmic Complexity...................
        numberOfOperations=0;
        startTime=System.currentTimeMillis();

        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

        // Task 5 End...................*/
    }
}





