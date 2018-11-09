package com.mcnichol.ctci.chapter01.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class HashTableTest {


    private HashTable<String, Integer> subject;

    @Before
    public void setUp() {
        subject = new HashTable<>();
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
        subject.put("my-key1", expectedValue);
        subject.put("my-key11", expectedValue);
        subject.put("my-key111", expectedValue);

        Integer actualValue = subject.get("my-key");

        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void returnsNullWhenGetObjectDoesNotExist() {

        Integer value = subject.get("my-key");

        assertNull(value);
    }

    @Test
    public void canInitializeHashTableWithBucketsForPerformance() throws InterruptedException {
        double smallTableTime, bigTableTime;
        int SMALL_BUCKET_SIZE = 10;
        int BIG_BUCKET_SIZE = 10000;

        HashTable<String, Integer> smallHashTable = new HashTable<>(SMALL_BUCKET_SIZE);
        HashTable<String, Integer> bigHashtTable = new HashTable<>(BIG_BUCKET_SIZE);
        List<String> strings = generateRandomStringKeys(1000);

        strings.forEach(string -> bigHashtTable.put(string, 10));
        strings.forEach(string -> smallHashTable.put(string, 10));

        Consumer<String> bigHashGet = bigHashtTable::get;
        Consumer<String> smallHashGet = smallHashTable::get;

        String theString = strings.get(strings.size() - 1);

        smallTableTime = getElapsedTimeFactoringOutJavaOptimization(theString, smallHashGet);
        bigTableTime = getElapsedTimeFactoringOutJavaOptimization(theString, bigHashGet);

        System.out.println(String.format("Fetch SmallTable: %.10f", smallTableTime));
        System.out.println(String.format("Fetch BigTable:   %.10f", bigTableTime));

        assertTrue(smallTableTime > bigTableTime);
    }

    public double getElapsedTimeFactoringOutJavaOptimization(String s, Consumer<String> aMethod) {
        long start, end;
        double numIterations = 10_000_000D;

        start = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            aMethod.accept(s);
        }
        end = System.nanoTime();

        double average = (end - start) / numIterations;
        return average / 1_000_000_000D;
    }

    public List<String> generateRandomStringKeys(int numOfRandomKeys) {
        List<String> keys = new ArrayList<>();

        for (int i = 0; i < numOfRandomKeys; i++) {
            byte[] array = new byte[10];
            new Random().nextBytes(array);
            keys.add(new String(array, Charset.forName("UTF-8")));
        }

        return keys;
    }

}