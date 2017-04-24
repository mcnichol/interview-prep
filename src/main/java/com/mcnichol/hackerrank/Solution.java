package com.mcnichol.hackerrank;

import java.util.Scanner;

public class Solution {

    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[6][6];
        int lineNumber = 0;
        while (in.hasNextLine()) {
            String[] inputRow = in.nextLine().split(" ");
            int[] row = new int[6];

            for (int i = 0; i < inputRow.length; i++) {
                row[i] = Integer.parseInt(inputRow[i]);
            }

            grid[lineNumber++] = row;
        }

        int maxSum = 0;

        for (int i = LOWER_BOUND; i < UPPER_BOUND; i++) {
            for (int j = LOWER_BOUND; j < UPPER_BOUND; j++) {
                int currentSum = calculateUpperGlass(i, j);
                currentSum += grid[i][j];
                currentSum += calculateLowerGlass(i, j);
                maxSum = currentSum > maxSum ? currentSum : maxSum;
            }
        }

    }
    public static int calculateLowerGlass(int colIndex, int rowIndex) {
        return 0;
    }


    public static int calculateUpperGlass(int colIndex, int rowIndex) {
        return 0;
    }
}