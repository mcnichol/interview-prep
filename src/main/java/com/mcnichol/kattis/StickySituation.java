package com.mcnichol.kattis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * While on summer camp, you are playing a game of hide-and-seek in the forest. You need to designate a “safe zone”, where, if the players manage to sneak there without being detected, they beat the seeker. It is therefore of utmost importance that this zone is well-chosen.
 * <p>
 * You point towards a tree as a suggestion, but your fellow hide-and-seekers are not satisfied. After all, the tree has branches stretching far and wide, and it will be difficult to determine whether a player has reached the safe zone. They want a very specific demarcation for the safe zone. So, you tell them to go and find some sticks, of which you will use three to mark a non-degenerate triangle (i.e. with strictly positive area) next to the tree which will count as the safe zone. After a while they return with a variety of sticks, but you are unsure whether you can actually form a triangle with the available sticks.
 * <p>
 * Can you write a program that determines whether you can make a triangle with exactly three of the collected sticks?
 * <p>
 * Input
 * The first line contains a single integer N, with 3≤N≤20000, the number of sticks collected. Then follows one line with NN positive integers, each less than 260, the lengths of the sticks which your fellow campers have collected.
 * <p>
 * Output
 * Output a single line containing a single word: possible if you can make a non-degenerate triangle with three sticks of the provided lengths, and impossible if you can not.
 */
public class StickySituation {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    //This constructors enables us to test our application with our own DI streams
    StickySituation(final InputStream inputStream, final OutputStream outputStream) {
        StickySituation.inputStream = inputStream;
        StickySituation.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(StickySituation.inputStream);
        PrintStream printStream = new PrintStream(StickySituation.outputStream);

        int numberOfSticks = scanner.nextInt();
        scanner.nextLine();  //Flush CRLF
        long[] allStickLengths = readStickLengthsFromInput(scanner, numberOfSticks);

        if (isValidTriangle(allStickLengths)) {
            printStream.println("possible");
        } else {
            printStream.println("impossible");
        }


    }

    private static boolean isValidTriangle(final long[] legs) {
        Arrays.sort(legs);

        for (int i = 0; i < legs.length - 2; i++) {
            if (legs[i] + legs[i + 1] > legs[i + 2]) return true;
        }

        return false;
    }

    

    private static long[] readStickLengthsFromInput(Scanner input, int numberOfSticks) {
        long[] allStickLengths = new long[numberOfSticks];
        for (int i = 0; i < numberOfSticks; i++) {
            allStickLengths[i] = input.nextLong();
        }

        return allStickLengths;
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
