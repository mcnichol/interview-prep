package com.mcnichol.pramp;

import com.mcnichol.pramp.solution.RootOfNumberSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RootOfNumberTest {

    private RootOfNumber rootOfNumber;

    @Before
    public void setUp() throws Exception {
        rootOfNumber = new RootOfNumberSolution();  // Remove this line and implement your own solution

        // TODO Uncomment below stub and implement your own solution
        // rootOfNumber = new RootOfNumberStub();
    }

    @Test
    public void testCase1() throws Exception {
        assertThat(rootOfNumber.root(4, 2), equalTo(2.0));
    }

    @Test
    public void testCase2() throws Exception {
        assertThat(rootOfNumber.root(27, 3), equalTo(3.0));
    }

    @Test
    public void testCase3() throws Exception {
        assertThat(rootOfNumber.root(16, 4), equalTo(2.0));
    }

    @Test
    public void testCase4() throws Exception {
        assertThat(rootOfNumber.root(3, 2), equalTo(1.732));
    }

    @Test
    public void testCase5() throws Exception {
        assertThat(rootOfNumber.root(10, 3), equalTo(2.154));
    }

    @Test
    public void testCase6() throws Exception {
        assertThat(rootOfNumber.root(160, 3), equalTo(5.429));
    }
}