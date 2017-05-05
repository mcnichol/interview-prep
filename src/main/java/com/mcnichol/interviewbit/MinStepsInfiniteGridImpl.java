package com.mcnichol.interviewbit;

/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 * (x,y) to:
 * * ( x,  y+1),  // NORTH
 * * ( x,  y-1),  // SOUTH
 * * (x+1,   y),  // EAST
 * * (x-1,   y),  // WEST
 * * (x+1, y+1),  // NE
 * * (x-1, y+1),  // NW
 * * (x+1, y-1),  // SE
 * * (x-1, y-1)   // SW
 * <p>
 * You are given a sequence of points in the order that you must travel the points.
 * <p>
 * Give the minimum number of steps in which you can arrive starting from the first point X[0] Y[0].
 * <p>
 * Note: Switched to using static arrays over Collections
 */
public class MinStepsInfiniteGridImpl implements MinStepsInfiniteGrid {
    @Override
    public int coverPoints(int[] x, int[] y) {
        return 0;
    }
}
