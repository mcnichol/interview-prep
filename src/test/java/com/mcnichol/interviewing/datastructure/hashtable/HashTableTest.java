package com.mcnichol.interviewing.datastructure.hashtable;

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


    private MyHashTable<String, Integer> subject;

    @Before
    public void setUp() {
        subject = new MyHashTable<>();
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
    public void canInitializeHashTableWithBucketsForPerformance() {
        double smallTableTime, bigTableTime;
        int SMALL_BUCKET_SIZE = 10;
        int BIG_BUCKET_SIZE = 10000;

        MyHashTable<String, Integer> smallHashTable = new MyHashTable<>(SMALL_BUCKET_SIZE);
        MyHashTable<String, Integer> bigHashtTable = new MyHashTable<>(BIG_BUCKET_SIZE);
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

    @Test
    public void whenLoadFactorReaches_70percent_doubbleBuckets() {
        // Load factor is f(N) = .70N where N is capacity

        fail();
    }

    @Test
    public void canRemoveFromHashTable() {
        fail();
    }

    @Test
    public void canProvideAlternativeCollisionResolution_chainingWithBST() {
        fail();
    }

    @Test
    public void canProvideAlternativeCollisionResolution_openAddressingWithLinearProbe() {
        fail();
    }

    @Test
    public void canProvideAlternativeCollisionResolution_openAddressingWithLinearProbe_implementsQuadraticHashing() {
        fail();
    }

    @Test
    public void canProvideAlternativeCollisionResolution_openAddressingWithLinearProbe_implementsDoubleHashing() {
        fail();
    }

    public double getElapsedTimeFactoringOutJavaOptimization(String s, Consumer<String> aMethod) {
        double numIterations = 10_000_000D;

        long loopStart = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            aMethod.accept(s);
        }
        long loopEnd = System.nanoTime();

        double average = (loopEnd - loopStart) / numIterations;
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