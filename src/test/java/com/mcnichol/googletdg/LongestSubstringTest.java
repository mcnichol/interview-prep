package com.mcnichol.googletdg;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Former Coding Interview Question:
 * Find longest word in dictionary that is a subsequence of a given string
 * Hone your problem-solving skills with this former Google interview question focused on strings.
 * It'll test your ability to optimize code and work with algorithms and data structures.
 * <p>
 * Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
 * <p>
 * Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
 * <p>
 * Note: D can appear in any format (list, hash table, prefix tree, etc.
 * <p>
 * For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"
 * <p>
 * The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
 * The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
 * The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
 * Learning objectives
 * This question gives you the chance to practice with algorithms and data structures. It’s also a good example of why careful analysis for Big-O performance is often worthwhile, as is careful exploration of common and worst-case input conditions.
 */
public class LongestSubstringTest {
    private LongestSubstring subject;
    private List<String> expectedWordList;
    private String expectedTargetString;

    @Before
    public void setUp() {
        subject = new LongestSubstring();
        expectedTargetString = "abppplee";
        expectedWordList = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
    }

    @Test
    public void canAcceptListOfWords() {
        subject.setTargetString(expectedTargetString);

        String actualValue = subject.getTargetString();

        assertThat(actualValue, equalTo(expectedTargetString));
    }

    @Test
    public void canTakeListOfStrings() {
        subject.setWordTestList(expectedWordList);

        List<String> actualWordTestList = subject.getWordTestList();

        assertThat(actualWordTestList, equalTo(expectedWordList));
    }

    @Ignore
    @Test
    public void respondsWithLongestSubsequenceFromWordList() {
        subject.setTargetString(expectedTargetString);
        subject.setWordTestList(expectedWordList);

        String actualLongestSubsequence = subject.testLongestSubsequence();

        assertThat(actualLongestSubsequence, equalTo("apple"));
    }
}