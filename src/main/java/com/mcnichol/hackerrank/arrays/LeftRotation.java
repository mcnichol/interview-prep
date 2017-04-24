package com.mcnichol.hackerrank.arrays;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] shifted_array = new int[n];

        for (int i = 0; i < n; i++) {
            shifted_array[getShiftedIndex(i, n, k)] = a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(shifted_array[i] + " ");
        }
    }

    public static int getShiftedIndex(int currentIndex, int arraySize, int shiftAmount) {
        return (currentIndex + shiftAmount) % arraySize;
    }

}
