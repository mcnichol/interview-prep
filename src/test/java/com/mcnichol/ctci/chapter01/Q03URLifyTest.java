package com.mcnichol.ctci.chapter01;

import com.mcnichol.ctci.chapter01.solutions.Q03DualLinearPass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class Q03URLifyTest {
    private Q03URLify subject;

    @Parameter
    public Class implementationClass;

    @Parameters(name = "{index}: Impl Class: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{Q03DualLinearPass.class},
                new Object[]{Q03DualLinearPass.class}
        );
    }

    @Before
    public void setUp() throws Exception {
        subject = (Q03URLify) implementationClass.getConstructor().newInstance();
    }

    @Test
    public void passedStringAndLength_returnsNonNullString() {
        String string = "String";

        String actualResult = subject.urlify(string.toCharArray(), string.length());

        assertNotNull(actualResult);
    }

    @Test
    public void whenStringPassedIsNull_returnsEmptyString() {
        String expectedResult = "";

        String actualResult = subject.urlify(null, 0);

        assertThat(actualResult, equalTo(expectedResult));
    }

    @Test
    public void replacesWhiteSpaceWithEscapedValues() {
        String expectedResult = "Mr%20John%20Smith";
        char[] charString = "Mr John Smith".toCharArray();

        String actualResult = subject.urlify(charString, 13);

        assertThat(actualResult, equalTo(expectedResult));
    }

    @Test
    public void trimsWhitespaceAtEndOfString() {
        char[] charString = "string   ".toCharArray();
        String expectedResult = "string";

        String actualResult = subject.urlify(charString, 6);

        assertThat(actualResult, equalTo(expectedResult));
    }
}