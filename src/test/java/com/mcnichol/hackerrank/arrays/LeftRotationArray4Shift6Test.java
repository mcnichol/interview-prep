package com.mcnichol.hackerrank.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftRotationArray4Shift6Test {
    private static final int SHIFT_AMOUNT = 6;
    private static final int ARRAY_SIZE = 4;

    //Array Size: 4, Shift: 6
    //Input Array:  [ 0, 1, 2, 3 ]
    //Output Array: [ 2, 3, 0, 1 ]

    @Test
    public void indexZeroShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(0, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(2, actualShiftedIndex);
    }

    @Test
    public void indexOneShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(1, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(3, actualShiftedIndex);
    }

    @Test
    public void indexTwoShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(2, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(0, actualShiftedIndex);
    }

    @Test
    public void indexThreeShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(3, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(1, actualShiftedIndex);
    }

    @Test
    public void indexFourShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(4, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(2, actualShiftedIndex);
    }
}