package com.mcnichol.pramp.solution;

import com.mcnichol.pramp.RootOfNumber;
import com.mcnichol.pramp.stub.RootOfNumberStub;

/**
 * Solution to PRAMP Root of Number Challenge
 *
 * @see RootOfNumberStub
 **/
public class RootOfNumberSolution implements RootOfNumber{
    public static void main(String[] args) {
        RootOfNumber solution = new RootOfNumberSolution();
        assert Math.abs(solution.root(7, 3) - 1.913) < .001 : "Not within threshold";
        assert Math.abs(solution.root(9, 2) - 2.999) < .001 : "Not within threshold";
        System.out.println(solution.root(27, 3));
    }

    public double root(double x, int root) {
        if (x == 0) {
            return 0;
        }

        double lowerBound = 0;
        double upperBound = max(1, x);
        double approxRoot = (upperBound + lowerBound) / 2;

        while (approxRoot - lowerBound >= 0.001) {
            if (Math.pow(approxRoot, root) > x) {
                upperBound = approxRoot;
            } else if (Math.pow(approxRoot, root) < x) {
                lowerBound = approxRoot;
            } else break;

            approxRoot = (upperBound + lowerBound) / 2;
        }

        return roundWithPrecision(approxRoot, .001);
    }

    private static double roundWithPrecision(double value, double precision) {
        double returnValue = value / precision;
        double remainder = returnValue % 1;

        double roundedUpValue = (returnValue + 1 - remainder) * precision;
        double roundedDownValue = (returnValue - remainder) * precision;

        return remainder >= .5 ? roundedUpValue : roundedDownValue;
    }

    private static double max(double i, double x) {
        return i > x ? i : x;
    }
}
