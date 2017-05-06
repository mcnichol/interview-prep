package com.mcnichol.interviewbit.solutions;

import com.mcnichol.interviewbit.MaxSumContiguousSubarray;

/**
 * My solution to Interviewbit's Max Sum of a Contiguous Subarray Problem
 * [https://www.interviewbit.com/problems/max-sum-contiguous-subarray/]
 *
 * @see com.mcnichol.interviewbit.MaxSumContiguousSubarray
 **/

public class MaxSumContiguousSubarray_v1 implements MaxSumContiguousSubarray {
    @Override
    public int maxSubArray(final int[] a) {

        int maxGlobal = a[0];
        int maxCurrent = a[0];

        for (int i = 1; i < a.length; i++) {
            maxCurrent = a[i] > (a[i] + maxCurrent) ? a[i] : a[i] + maxCurrent;

            if (maxCurrent > maxGlobal) maxGlobal = maxCurrent;
        }

        return maxGlobal;
    }
}
