package com.mcnichol.hackerrank.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftRotationArray5Shift10Test {
    private static final int SHIFT_AMOUNT = 10;
    private static final int ARRAY_SIZE = 5;

    //Array Size: 5, Shift: 10
    //e.g.
    //  Input Array:  [ 1, 2, 3, 4, 5 ]
    //  Output Array: [ 1, 2, 3, 4, 5 ]

    @Test
    public void indexZeroShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(0, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(0, actualShiftedIndex);
    }

    @Test
    public void indexOneShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(1, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(1, actualShiftedIndex);
    }

    @Test
    public void indexTwoShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(2, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(2, actualShiftedIndex);
    }

    @Test
    public void indexThreeShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(3, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(3, actualShiftedIndex);
    }

    @Test
    public void indexFourShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(4, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(4, actualShiftedIndex);
    }
}