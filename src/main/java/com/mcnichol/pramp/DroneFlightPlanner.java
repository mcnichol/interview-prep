package com.mcnichol.pramp;


/**
 * You’re an engineer at a disruptive drone delivery startup and your CTO asks you to come up with an efficient
 * algorithm that calculates the minimum amount of energy required for the company’s drone to complete its flight.
 * You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends, and it gains
 * 1 kWh for every mile it descends. Flying sideways neither burns nor adds any energy.
 * <p>
 * Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the
 * minimal amount of energy the drone would need to complete its route. Assume that the drone starts its flight
 * at the first point in route. That is, no energy was expended to place the drone at the starting point.
 * <p>
 * For simplicity, every 3D point will be represented as an integer array whose length is 3. Also, the values
 * at indexes 0, 1, and 2 represent the x, y and z coordinates in a 3D point, respectively.
 * <p>
 * Explain your solution and analyze its time and space complexities.
 * <p>
 * <p>
 * Example:
 * input:  route = [ [0,   2, 10],
 * [3,   5,  0],
 * [9,  20,  6],
 * [10, 12, 15],
 * [10, 10,  8] ]
 * <p>
 * output: 5
 * #Less than 5 kWh and the drone would crash before the finish line.
 * #More than 5 kWh and it’d end up with excess energy
 */
  /*
  Notes: Arrived at working pseudo-code solution in ~10m
  Issues:
        * Interviewer did not understand Problem being a 2D array, created confusion
        * Was looping through 2Dimension only running three times instead of looping through all routes at 1D
  */

public class DroneFlightPlanner {
    private static int calcDroneMinEnergy(int[][] route) {
        return 0;
    }

    public static void main(String[] args) {

        int[][] input = new int[][]{
                {0, 2, 10},
                {3, 5, 0},
                {9, 20, 6},
                {10, 12, 15},
                {10, 10, 8}
        };

        assert calcDroneMinEnergy(input) == -5 : "Invalid response";
    }
}
