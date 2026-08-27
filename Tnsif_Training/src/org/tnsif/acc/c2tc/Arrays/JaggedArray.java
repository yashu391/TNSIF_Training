package org.tnsif.acc.c2tc.Arrays;

public class JaggedArray {

    public static void main(String[] args) {

        // Step 1: Declare the jagged array
        int[][] StudentInGrade = new int[3][];

        // Step 2: Initialize the subarrays
        StudentInGrade[0] = new int[2]; // Grade 1 has 2 students
        StudentInGrade[1] = new int[3]; // Grade 2 has 3 students
        StudentInGrade[2] = new int[1]; // Grade 3 has 1 student

        // Step 3: Assign values
        StudentInGrade[0][0] = 10;
        StudentInGrade[0][1] = 20;

        StudentInGrade[1][0] = 23;
        StudentInGrade[1][1] = 40;
        StudentInGrade[1][2] = 90;

        StudentInGrade[2][0] = 80;

        // Step 4: Display the jagged array
        for (int i = 0; i < StudentInGrade.length; i++) {

            for (int j = 0; j < StudentInGrade[i].length; j++) {

                System.out.println(
                    "Grade " + (i + 1) +
                    " Student " + (j + 1) +
                    ": " + StudentInGrade[i][j]
                );
            }
        }
    }
}