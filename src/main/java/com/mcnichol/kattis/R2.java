package com.mcnichol.kattis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The number S is called the mean of two numbers R1 and R2 if S is equal to (R1+R2)/2. Mirko’s birthday present for Slavko was two integers R1 and R2. Slavko promptly calculated their mean which also happened to be an integer but then lost R2! Help Slavko restore R2.
 * <p>
 * The first and only line of input contains two integers R1 and S, both between −1000 and 1000.
 */

public class R2 {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    //This constructors enables us to test our application with our own hook for DI
    public R2(final InputStream inputStream, final OutputStream outputStream) {
        R2.inputStream = inputStream;
        R2.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(R2.inputStream);
        PrintStream printStream = new PrintStream(R2.outputStream);

        int r1 = scanner.nextInt();
        int s = scanner.nextInt();

        printStream.println(calculateR2(r1, s));
    }

    /**
     * To find R2 requires the calculation R2 = 2 * s - r1
     *
     * @param r1 First known value for computing mean
     * @param s  The resultant mean
     * @return computed r2 value
     */
    private static int calculateR2(final int r1, final int s) {
        return 2 * s - r1;
    }

    /**
     * Validate streams were supplied else use standard System streams
     */
    private static void validateStreams() {
        if (inputStream == null) {
            inputStream = System.in;
        }

        if (outputStream == null) {
            outputStream = System.out;
        }
    }
}
