package com.mcnichol.pramp.solution;

/**
 * Solution to PRAMP Drone Flight Planner Challenge
 *
 * @see com.mcnichol.pramp.DroneFlightPlanner
 **/

public class DroneFlightPlannerSolution {

    static int calcDroneMinEnergy(int[][] route) {
        int absoluteMinimum = 0;
        int runningTotal = 0;

        for (int i = 1; i < route.length; i++) {

            int lastPosition = route[i - 1][2];
            int currentPosition = route[i][2];

            runningTotal += (lastPosition - currentPosition);

            if (runningTotal < absoluteMinimum) {
                absoluteMinimum = runningTotal;
            }
        }

        return absoluteMinimum;
    }

    public static void main(String[] args) {

        int[][] input = new int[][]{
                {0, 2, 10},
                {3, 5, 0},
                {9, 20, 6},
                {10, 12, 15},
                {10, 10, 8}
        };

        System.out.println(calcDroneMinEnergy(input));
    }
}
