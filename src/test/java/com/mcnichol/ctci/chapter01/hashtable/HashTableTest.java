package com.mcnichol.ctci.chapter01.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class HashTableTest {

    private HashTable<String, Integer> subject;

    @Before
    public void setUp() throws Exception {
        subject = new HashTable<String, Integer>();
    }

    @Test
    public void hashTableisEmpty() {
        assertThat(subject.size(), equalTo(0));
    }

    @Test
    public void addingToHashTableIncreasesSize() {

        subject.put("my-key", 10);

        assertThat(subject.size(), equalTo(1));
    }

    @Test
    public void canRetrieveFromHashTable() {
        int expectedValue = 10;
        subject.put("my-key", expectedValue);

        Integer actualValue = subject.get("my-key");

        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void returnsNullWhenGetOjbectDoesNotExist() {

        Integer value = subject.get("my-key");

        assertNull(value);
    }


    @Test
    public void canIncreaseHashTableSize() {

    }

}