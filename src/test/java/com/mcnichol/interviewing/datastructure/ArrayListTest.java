package com.mcnichol.interviewing.datastructure;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ArrayListTest {

    private static final String TEST_DATA_0 = "test-data-0";
    private static final String TEST_DATA_1 = "test-data-1";
    private static final String TEST_DATA_2 = "test-data-2";
    private static final String TEST_DATA_3 = "test-data-3";
    private List<String> customArrayList;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        customArrayList = new ArrayList<>();
    }

    @Test
    public void newListIsEmtpy() throws Exception {
        assertTrue(customArrayList.isEmpty());
    }

    @Test
    public void addingToListMakesNotEmpty() throws Exception {
        customArrayList.add("test-data");

        assertFalse(customArrayList.isEmpty());
    }

    @Test
    public void canTestIfListContainsObject() {
        customArrayList.add(TEST_DATA_0);
        customArrayList.add(TEST_DATA_1);
        customArrayList.add(TEST_DATA_2);

        assertTrue(customArrayList.contains(TEST_DATA_1));
    }

    @Test
    public void canTestIfListContainsCollection() throws Exception {
        List<Object> elementsToCheck = new java.util.ArrayList() {{
            add(TEST_DATA_0);
            add(TEST_DATA_1);
            add(TEST_DATA_2);
        }};

        customArrayList.add(TEST_DATA_0);
        customArrayList.add(TEST_DATA_1);
        customArrayList.add(TEST_DATA_2);

        assertTrue(customArrayList.containsAll(elementsToCheck));
    }

    @Test
    public void canTestIfListContainsDuplicatesInCollection() throws Exception {
        List<Object> elementsToCheck = new java.util.ArrayList() {{
            add(TEST_DATA_0);
            add(TEST_DATA_1);
            add(TEST_DATA_1);
            add(TEST_DATA_2);
            add(TEST_DATA_2);
            add(TEST_DATA_2);
        }};

        customArrayList.add(TEST_DATA_0);
        customArrayList.add(TEST_DATA_1);
        customArrayList.add(TEST_DATA_2);
        customArrayList.add(TEST_DATA_2);
        customArrayList.add(TEST_DATA_3);

        assertFalse(customArrayList.containsAll(elementsToCheck));
    }

    @Test
    public void returnsElementFromSpecificIndex() throws Exception {
        customArrayList.add(TEST_DATA_0);
        customArrayList.add(TEST_DATA_2);

        assertEquals(customArrayList.get(1), TEST_DATA_2);

    }

    @Test
    public void throwsExceptionIfIndexGoesBeyondArrayBounds() throws Exception {
        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage(equalTo("Index: 0, Size: 0"));
        customArrayList.get(0);
    }

    @Test
    public void throwsExceptionIfIndexGoesBelowArrayBounds() throws Exception {
        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage(equalTo("Index: -1, Size: 0"));
        customArrayList.get(-1);
    }

    @Test
    public void addingAtIndexOutOfBoundsThrowsException() throws Exception {
        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage(equalTo("Index: 1, Size: 0"));
        customArrayList.add(1, TEST_DATA_0);
    }

    @Test
    public void add_whenIndexExists_addsValueAtIndex() throws Exception {
        customArrayList.add(TEST_DATA_0);
        customArrayList.add(TEST_DATA_1);
        customArrayList.add(TEST_DATA_2);

        customArrayList.add(2, TEST_DATA_3);

        assertEquals(customArrayList.get(2), TEST_DATA_3);
    }

    @Test
    public void growsDynamicallyWhenFull() {
        ArrayList<Object> elements = new ArrayList<>(2);

        elements.add(TEST_DATA_0);
        elements.add(TEST_DATA_1);
        elements.add(TEST_DATA_2);

        assertEquals(3, elements.size());
    }

    @Test
    public void growsDynamicallyWhenAddingByIndex() {
        ArrayList<Object> elements = new ArrayList<>(2);
        elements.add(TEST_DATA_0);
        elements.add(TEST_DATA_1);

        elements.add(1, TEST_DATA_2);

        assertEquals(3, elements.size());
    }

    @Test
    public void canAddCollection() throws Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(TEST_DATA_0);
        arrayList.add(TEST_DATA_1);

        customArrayList.addAll(arrayList);

        assertThat(customArrayList.size(), equalTo(2));
        assertEquals(TEST_DATA_0, customArrayList.get(0));
    }

    @Test
    public void addingCollectionGreaterThanCapacityGrows() throws Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");

        customArrayList.addAll(arrayList);

        assertEquals(customArrayList.size(), 11);

    }
}
