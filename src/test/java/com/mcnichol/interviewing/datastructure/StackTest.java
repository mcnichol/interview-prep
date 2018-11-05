package com.mcnichol.interviewing.datastructure;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private Stack<Integer> stack;


    @Before
    public void setUp() throws Exception {
        stack = new Stack();

    }

    @Test
    public void canDetectIfStackIsEmpty() {

        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushingToStackMakesIsEmptyFalse() {
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void canPopValuesFromStack() {
        stack.push(1);

        int actualValue = stack.pop();

        assertThat(actualValue, equalTo(1));
    }

    @Test
    public void canDetectWhenStackIsFull() {
        assertFalse(stack.isFull());

        for (int i = 0; i < 10; i++) {
            stack.push(1);
        }

        assertTrue(stack.isFull());
    }

    @Test
    public void throwsRuntimeExceptionIfPoppingEmpty() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Stack is already empty, nothing to pop.");

        stack.pop();
    }

    @Test
    public void stackShowsEmptyWhenAllValuesArePopped(){
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Ignore
    @Test
    public void throwsRuntimeExceptionIfStackIsFull() {

        for(int i=0; i < 10; i++) {
            stack.push(1);
        }

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Stack is full, cannot push.");

        stack.push(1);
    }

    @Test
    public void stackIsGenerifcType() {
        Stack<String> stringStack = new Stack<>();
        String expectedValue = "Some Value";
        stringStack.push(expectedValue);

        String actualValue = stringStack.pop();

        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void canPeekAtTopOfStackWithoutPopping() {
        int expectedValue = 10;
        stack.push(expectedValue);
        Integer actualValue = stack.peek();

        assertThat(actualValue, equalTo(expectedValue));
        assertFalse(stack.isEmpty());
    }

    @Test
    public void canGetSizeOfStack() {
        stack.push(1);
        stack.push(1);
        stack.push(1);

        assertThat(stack.size(), equalTo(3));
    }

    @Test
    public void stackGrowsWhenFull() {
        for (int i = 0; i < 10; i++) {
            stack.push(1);
        }

        stack.push(1);

        assertFalse(stack.isFull());
    }
}