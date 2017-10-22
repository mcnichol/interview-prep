package com.mcnichol.kattis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Great scientific discoveries are often named by the last names of scientists that made them. For example, the most popular asymmetric cryptography system, RSA was discovered by Rivest, Shamir and Adleman. Another notable example is the Knuth-Morris-Pratt algorithm, named by Knuth, Morris and Pratt.
 * <p>
 * Scientific papers reference earlier works a lot and it’s not uncommon for one document to use two different naming conventions: the short variation (e.g. KMP) using only the first letters of authors last names and the long variation (e.g. Knuth-Morris-Pratt) using complete last names separated by hyphens.
 * <p>
 * We find mixing two conventions in one paper to be aesthetically unpleasing and would like you to write a program that will transform long variations into short.
 * <p>
 * Example:
 * input: Knuth-Morris-Pratt
 * output: KMP
 * <p>
 * input: Mirko-Slavko
 * output: MS
 * <p>
 * input: Pasko-Patak
 * output: PP
 */

public class Autori {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    //This constructors enables us to test our application with our own DI streams
    Autori(final InputStream inputStream, final OutputStream outputStream) {
        Autori.inputStream = inputStream;
        Autori.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(Autori.inputStream);
        PrintStream printStream = new PrintStream(outputStream);

        String input;

        input = scanner.next();

        String yummyString = processInput(input);

        printStream.println(yummyString);
    }

    /**
     * Splits names on a `-` boundary, take first character of each  name and concatenate them as a single string output.
     *
     * @param userInput String of names separated by `-`
     * @return First initial of each name
     */
    private static String processInput(String userInput) {

        return Arrays.stream(userInput.split("-"))
                .map((e) -> e.charAt(0))
                .collect(
                        StringBuilder::new,
                        (sb, i) -> sb.append((char) i),
                        StringBuilder::append)
                .toString();
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
