package com.mcnichol.interviewbit.solutions;

import com.mcnichol.interviewbit.MaxSumContiguousSubarray;

/**
 * Complete Solution:
 * <p>
 * Interviewbit's - Maximum Sum of Contiguous Subarray Problem
 * [https://www.interviewbit.com/problems/max-sum-contiguous-subarray/]
 *
 * @see com.mcnichol.interviewbit.MaxSumContiguousSubarray
 **/

public class MaxSumContiguousSubarray_v0 implements MaxSumContiguousSubarray {
    public int maxSubArray(final int[] A) {

        int sum = Integer.MIN_VALUE;
        int last = 0;

        for (int num : A) {

            last += num;
            sum = Math.max(sum, last);
            if (last < 0)
                last = 0;
        }

        return sum;

    }
}
