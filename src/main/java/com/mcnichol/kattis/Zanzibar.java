package com.mcnichol.kattis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Turtles live long (and prosper). Turtles on the island Zanzibar are even immortal. Furthermore, they are asexual, and every year they give birth to at most one child. Apart from that, they do nothing. They never leave their tropical paradise.
 * <p>
 * Zanzi Bar, the first turtle on Zanzibar, has one further activity: it keeps track of the number of turtles on the island. Every New Year’s Day it counts the turtles, and writes the total number in a small booklet. After many years this booklet contains a non-decreasing sequence of integers, starting with one or more ones. (After emerging from its egg on Zanzibar’s beautiful beach, it took Zanzi some time to start a family on its own.)
 * <p>
 * One day Zanzi realizes that it could also be the case that turtles from abroad come to Zanzibar, by boat or plane. Now it wonders how many of the inhabitants were not born on Zanzibar. Unfortunately, it can only derive a lower bound from the sequence in the booklet. Indeed, if the number of turtles in a year is more than twice as big as the year before, the difference must be fully explained by import.
 * <p>
 * As soon as Zanzibar has 1_000_000 turtles, the island is totally covered with turtles, and both reproduction and import come to a halt. Please help Zanzi! Write a program that computes the lower bound of import turtles, given a sequence, as described above.
 * <p>
 * Input
 * The input starts with a line containing an integer TT (1≤T≤13), the number of test cases. Then for each test case:
 * <p>
 * One line containing a sequence of space-separated, positive integers (≤1_000_000), non-decreasing, starting with one or more ones. For convenience, a single space and a 0 are appended to the end of the sequence.
 * Output
 * For each test case, output a line containing a single integer: the lower bound for the number of turtles not born on Zanzibar.
 */
public class Zanzibar {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    //This constructors enables us to test our application with our own DI streams
    Zanzibar(final InputStream inputStream, final OutputStream outputStream) {
        Zanzibar.inputStream = inputStream;
        Zanzibar.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(Zanzibar.inputStream);
        PrintStream printStream = new PrintStream(Zanzibar.outputStream);
        List<String> eachTestCase = new ArrayList<>();

        String numberOfTestCases = scanner.nextLine();

        while (scanner.hasNext()) {
            eachTestCase.add(scanner.nextLine());
        }

        for (String testCase : eachTestCase) {
            int totalImmigratedTurtles = 0;

            String[] turtlePopulationForYear = testCase.split(" ");
            for (int i = 1; i < turtlePopulationForYear.length; i++) {
                if(Integer.valueOf(turtlePopulationForYear[i]) > Integer.valueOf(turtlePopulationForYear[i-1]) * 2){
                    totalImmigratedTurtles += Integer.valueOf(turtlePopulationForYear[i]) - Integer.valueOf(turtlePopulationForYear[i - 1]) * 2;
                }
            }
            printStream.println(totalImmigratedTurtles);
        }
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
