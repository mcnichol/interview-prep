package com.mcnichol.interviewbit.solutions;

import com.mcnichol.interviewbit.MinStepsInfiniteGrid;

/**
 * Complete Solution:
 * <p>
 * Interviewbit's - Min Steps in Infinite Grid Problem
 * [https://www.interviewbit.com/problems/min-steps-in-infinite-grid/]
 *
 * @see com.mcnichol.interviewbit.MinStepsInfiniteGrid
 **/
public class MinStepsInfiniteGrid_v0 implements MinStepsInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    @Override
    public int coverPoints(int[] x, int[] y) {
        int numSteps = 0;
        for (int i = 1; i < x.length; i++) {
            numSteps += Math.max(Math.abs(x[i] - x[i - 1]), Math.abs(y[i] - y[i - 1]));
        }
        return numSteps;
    }

}
