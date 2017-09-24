package com.mcnichol.pramp;

import com.mcnichol.pramp.solution.SentenceReverseSolution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SentenceReverseTest {

    private SentenceReverse sentenceReverse;

    @Before
    public void setUp() throws Exception {
        sentenceReverse = new SentenceReverseSolution();  // Remove this line and implement your own solution

        // TODO Uncomment below stub and implement your own solution
        // sentenceReverse = new SentenceReverseStub();
    }

    @Test
    public void reversesString() {
        char[] input = "perfect makes practice".toCharArray();
        char[] expected = "practice makes perfect".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleChar() throws Exception {
        char[] input = "a".toCharArray();
        char[] expected = "a".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleWordCharArray() throws Exception {
        char[] input = "one".toCharArray();
        char[] expected = "one".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }
}