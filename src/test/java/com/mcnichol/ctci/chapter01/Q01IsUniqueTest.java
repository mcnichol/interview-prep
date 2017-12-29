package com.mcnichol.ctci.chapter01;

import com.mcnichol.ctci.chapter01.solutions.Q01BruteForceInsertionSortAndCheckWithGuardClause;
import com.mcnichol.ctci.chapter01.solutions.Q01BruteForceInsertionSortAndCheckWithoutGuardClause;
import com.mcnichol.ctci.chapter01.solutions.Q01LeveragingJavaMethods;
import com.mcnichol.ctci.chapter01.solutions.Q01OptimalSolution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Q01IsUniqueTest {

    private Q01IsUnique ch01Q01;

    @Parameter
    public Class implementationClass;

    @Parameters(name = "{index}: Impl Class: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{Q01OptimalSolution.class},
                new Object[]{Q01LeveragingJavaMethods.class},
                new Object[]{Q01BruteForceInsertionSortAndCheckWithGuardClause.class},
                new Object[]{Q01BruteForceInsertionSortAndCheckWithoutGuardClause.class}
        );
    }

    @Before
    public void setup() throws Exception {
        ch01Q01 = (Q01IsUnique) implementationClass.getConstructor().newInstance();
    }

    @Test
    public void stringWithOneCharacterIsUnique() {
        assertTrue(ch01Q01.isUnique("a"));
    }

    @Test
    public void detectsStringOfAllUniqueCharacters() {
        assertTrue(ch01Q01.isUnique("abcd"));
    }

    @Test
    public void detectsDuplicatesInString() {
        assertFalse(ch01Q01.isUnique("abcdb"));
    }

    @Test
    public void detectsDuplicatesInString_withoutCheesing() {
        assertFalse(ch01Q01.isUnique("aa"));
    }

    @Test
    public void measureTimeComplexity() {

        System.out.println("\n\nStarting Time Complexity run for " + implementationClass.getName());
        for (int i = 1; i < 513; i *= 2) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {

                char c = (char) (j % 128);
                sb.append(c);
            }

            String checkUniqueString = sb.toString();
            int microbenchmarkIterations = 100000;
            long start = System.currentTimeMillis();

            boolean isUnique = true;
            for (int j = 0; j < microbenchmarkIterations; j++) {
                isUnique = ch01Q01.isUnique(checkUniqueString);
            }
            long elapsedTime = System.currentTimeMillis() - start;

            System.out.println(String.format("Elapsed Time for unique(%s) Run %s:\t%1.6f", isUnique, i, (double) elapsedTime / microbenchmarkIterations));
        }

    }
}