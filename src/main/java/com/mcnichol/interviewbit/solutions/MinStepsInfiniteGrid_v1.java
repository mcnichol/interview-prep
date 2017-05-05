package com.mcnichol.interviewbit.solutions;

import com.mcnichol.interviewbit.MinStepsInfiniteGrid;

/**
 * My solution to Interviewbit's Min Steps in Infinite Grid Problem
 * [https://www.interviewbit.com/problems/min-steps-in-infinite-grid/]
 *
 * @see com.mcnichol.interviewbit.MinStepsInfiniteGrid
 **/

public class MinStepsInfiniteGrid_v1 implements MinStepsInfiniteGrid {
    @Override
    public int coverPoints(int[] x, int[] y) {
        int totalSteps = 0;

        //Start at my zero point
        for (int i = 1; i < x.length; i++) {

            int currentXDist = Math.abs(x[i] - x[i - 1]);
            int currentYDist = Math.abs(y[i] - y[i - 1]);

            while (currentXDist > 0 && currentYDist > 0) {
                totalSteps++;
                currentXDist--;
                currentYDist--;
            }

            while (currentXDist > 0) {
                totalSteps++;
                currentXDist--;
            }

            while (currentYDist > 0) {
                totalSteps++;
                currentYDist--;
            }
        }

        return totalSteps;

    }
}
