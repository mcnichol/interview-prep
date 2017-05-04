package com.mcnichol.pramp;

/**
 * Solution to PRAMP Root of Number Challenge
 *
 * @see com.mcnichol.pramp.RootOfNumber
 **/
public class RootOfNumberSolution {
    public static void main(String[] args) {
        assert Math.abs(root(7, 3) - 1.913) < .001: "Not within threshold";
        assert Math.abs(root(9, 2) - 2.999) < .001: "Not within threshold";
        System.out.println(root(64, 3));
    }

    private static float root(float x, int root) {
        if (x == 0) {
            return 0;
        }

        float lowerBound = 0;
        float upperBound = max(1, x);
        float approxRoot = (upperBound + lowerBound) / 2;

        while (approxRoot - lowerBound >= 0.001) {
            if (Math.pow(approxRoot, root) > x) {
                upperBound = approxRoot;
            } else if (Math.pow(approxRoot, root) < x) {
                lowerBound = approxRoot;
            }else break;

            approxRoot = (upperBound + lowerBound) / 2;
        }

        return approxRoot;
    }

    private static float max(float i, float x) {
        return i > x ? i : x;
    }
}
