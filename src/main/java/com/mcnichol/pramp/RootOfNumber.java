package com.mcnichol.pramp;

/**
 * Many times, we need to re-implement basic functions without using any standard
 * library functions already implemented. For example, when designing a chip that
 * requires very little memory space.
 * <p>
 * In this question we’ll implement a function root that calculates the n’th root
 * of a number. The function takes a nonnegative number x and a positive integer n,
 * and returns the positive n’th root of x within an error of 0.001 (i.e. suppose
 * the real root is y, then the error is: |y-root(x,n)| and must satisfy
 * |y-root(x,n)| < 0.001).
 * <p>
 * Don’t be intimidated by the question. While there are many algorithms to
 * calculate roots that require prior knowledge in numerical analysis (some of
 * them are mentioned here), there is also an elementary method which doesn’t
 * require more than guessing-and-checking. Try to think more in terms of the latter.
 * <p>
 * Make sure your algorithm is efficient, and analyze its time and space complexities.
 * <p>
 * Example:
 * input:  x = 7, n = 3
 * output: 1.913
 * <p>
 * input:  x = 9, n = 2
 * output: 2.999
 * <p>
 * <p>
 * Constraints:
 * <p>
 * [time limit] 5000ms
 * [input] float x
 * - 0 ≤ x
 * [input] integer n
 * - 0 < n
 * [output] float
 */
public class RootOfNumber {
    public static void main(String[] args) {
        assert Math.abs(root(7, 3) - 1.913) < .001 : "Not within threshold";
        assert Math.abs(root(9, 2) - 2.999) < .001 : "Not within threshold";
    }

    private static float root(float x, int root) {
        return 0f;
    }
}
