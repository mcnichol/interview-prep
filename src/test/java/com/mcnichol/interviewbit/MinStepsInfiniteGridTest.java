package com.mcnichol.interviewbit;

import com.mcnichol.interviewbit.solutions.MinStepsInfiniteGrid_v0;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinStepsInfiniteGridTest {

    private MinStepsInfiniteGrid subject;

    @Before
    public void setUp() throws Exception {
        subject = new MinStepsInfiniteGrid_v0();
    }

    @Test
    public void canDetectNoStepsNeeded() throws Exception {
        int[] x = {0, 0};
        int[] y = {0, 0};

        int actualSteps = subject.coverPoints(x, y);

        assertThat(actualSteps, is(0));
    }

    @Test
    public void canDetecMovingDiagonally() throws Exception {
        int[] x = {0, 10};
        int[] y = {0, 10};

        int actualSteps = subject.coverPoints(x, y);

        assertThat(actualSteps, is(10));
    }
}