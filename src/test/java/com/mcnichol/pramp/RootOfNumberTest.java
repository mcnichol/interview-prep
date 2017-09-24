package com.mcnichol.pramp;

import com.mcnichol.pramp.solution.RootOfNumberSolution;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class RootOfNumberTest {

    RootOfNumber solvedAndPassing = new RootOfNumberSolution();
//    RootOfNumber forYouToUncommentAndImplement = new RootOfNumberStub();
    @Test
    public void testCase1() throws Exception {
        assertThat(solvedAndPassing.root(4, 2), equalTo(2.0));
    }
    @Test
    public void testCase2() throws Exception {
        assertThat(solvedAndPassing.root(27, 3), equalTo(3.0));
    }
    @Test
    public void testCase3() throws Exception {
        assertThat(solvedAndPassing.root(16, 4), equalTo(2.0));
    }
    @Test
    public void testCase4() throws Exception {
        assertThat(solvedAndPassing.root(3, 2), equalTo(1.732));
    }
    @Test
    public void testCase5() throws Exception {
        assertThat(solvedAndPassing.root(10, 3), equalTo(2.154));
    }
    @Test
    public void testCase6() throws Exception {
        assertThat(solvedAndPassing.root(160, 3), equalTo(5.429));
    }
}