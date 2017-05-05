package com.mcnichol.ctci.chapter01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CTCI_C01_Q01_Test {

    private CTCI_C01_Q01 ch01Q01;

    @Before
    public void setUp() throws Exception {
        ch01Q01 = new CTCI_C01_Q01();
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
        assertFalse(ch01Q01.isUnique("abbcd"));
    }
}