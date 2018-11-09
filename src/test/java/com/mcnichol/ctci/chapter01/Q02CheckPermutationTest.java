package com.mcnichol.ctci.chapter01;

import com.mcnichol.ctci.chapter01.solutions.Q02BruteForce;
import com.mcnichol.ctci.chapter01.solutions.Q02HashMap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class Q02CheckPermutationTest {
    private Q02CheckPermutation subject;

    @Parameter
    public Class implementationClass;

    @Parameters(name = "{index}: Impl Class: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{Q02BruteForce.class},
                new Object[]{Q02HashMap.class},
                new Object[]{Q02CharArrayHash.class}
        );
    }

    @Before
    public void setUp() throws Exception {
        subject = (Q02CheckPermutation) implementationClass.getConstructor().newInstance();
    }

    @Test
    public void ifStringsAreNotSameSize_areNotPermutations() {
        String stringOne = "string";
        String stringTwo = "s";

        assertFalse(subject.isPermutation(stringOne, stringTwo));
    }

    @Test
    public void stringsAreIdentical_arePermutations() {
        String stringOne = "string";
        String stringTwo = "string";

        assertTrue(subject.isPermutation(stringOne, stringTwo));
    }

    @Test
    public void stringsAsPermutations_returnTrue() {
        String stringOne = "string";
        String stringTwo = "grints";

        assertTrue(subject.isPermutation(stringOne, stringTwo));
    }

    @Test
    public void stringsWithDifferentChars_returnFalse() {
        String stringOne = "string";
        String stringTwo = "abcdef";

        assertFalse(subject.isPermutation(stringOne, stringTwo));
    }
}