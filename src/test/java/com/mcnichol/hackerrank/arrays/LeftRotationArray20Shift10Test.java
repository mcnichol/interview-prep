package com.mcnichol.hackerrank.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftRotationArray20Shift10Test {
    private static final int SHIFT_AMOUNT = 10;
    private static final int ARRAY_SIZE = 20;

    //Array Size: 20, Shift: 10
    //Input Array:  [ 41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51 ]
    //Output Array: [ 77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77 ]

    @Test
    public void indexZeroShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(0, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(10, actualShiftedIndex);
    }

    @Test
    public void indexOneShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(1, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(11, actualShiftedIndex);
    }

    @Test
    public void indexTwoShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(2, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(12, actualShiftedIndex);
    }

    @Test
    public void indexThreeShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(3, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(13, actualShiftedIndex);
    }

    @Test
    public void indexFourShift() throws Exception {
        int actualShiftedIndex = LeftRotation.getShiftedIndex(4, ARRAY_SIZE, SHIFT_AMOUNT);

        assertEquals(14, actualShiftedIndex);
    }
}