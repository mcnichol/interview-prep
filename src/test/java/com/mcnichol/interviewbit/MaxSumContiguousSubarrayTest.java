package com.mcnichol.interviewbit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumContiguousSubarrayTest {
    @Test
    public void returnsCountOfSingleArray() throws Exception {
        MaxSumContiguousSubarray subject = new MaxSumContiguousSubarrayImpl();

        int actualCount = subject.maxSubArray(new int[]{1});

        assertEquals(1, actualCount);
    }
}