package com.mcnichol.kattis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * You are part of a team developing software to help students learn basic mathematics.
 * You are to write one part of that software, which is to display possibly improper fractions as mixed fractions.
 * A proper fraction is one where the numerator is less than the denominator;
 * a mixed fraction is a whole number followed by a proper fraction.
 * For example the improper fraction 27/12 is equivalent to the mixed fraction 2 3/12.
 * You should not reduce the fraction (i.e. don’t change 3/12 to 1/4).
 * <p>
 * Input
 * Input has one test case per line.
 * Each test case contains two integers in the range [1,231−1].
 * The first number is the numerator and the second is the denominator.
 * A line containing 0 0 will follow the last test case.
 * <p>
 * Output
 * For each test case, display the resulting mixed fraction as a whole number followed by a
 * proper fraction using whitespace to separate the output tokens.
 */
public class MixedFractions {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    //This constructors enables us to test our application with our own DI streams
    MixedFractions(final InputStream inputStream, final OutputStream outputStream) {
        MixedFractions.inputStream = inputStream;
        MixedFractions.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(MixedFractions.inputStream);
        PrintStream printStream = new PrintStream(MixedFractions.outputStream);

        ArrayList<String> allTestCases = new ArrayList<>();
        while(scanner.hasNext()){
            allTestCases.add(scanner.nextLine());
        }

        List<String> onlyTestCases = stripEndingTestSequence(allTestCases);

        for(String testCase : onlyTestCases){
            String[] fraction = testCase.split(" ");
            Integer numerator = Integer.valueOf(fraction[0]);
            Integer denominator = Integer.valueOf(fraction[1]);

            printStream.printf("%d %d / %d\n", getWholeNumber(numerator, denominator), getProperNumerator(numerator, denominator), denominator);
        }
    }

    private static int getProperNumerator(final Integer numerator, final Integer denominator) {
        return numerator - getWholeNumber(numerator, denominator) * denominator;
    }

    private static int getWholeNumber(final Integer numerator, final Integer denominator) {
        return numerator / denominator;
    }

    private static List<String> stripEndingTestSequence(final ArrayList<String> allTestCases) {
       return allTestCases.subList(0, allTestCases.size() - 1);
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
