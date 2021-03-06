package com.mcnichol.interviewing.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SorterTesting {

    @Parameters(name = "{index}: Sort Type: {0}")
    public static Collection<Object[]> classes() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{SelectionSort.class});
        list.add(new Object[]{InsertionSort.class});
        list.add(new Object[]{ShellSort.class});
        list.add(new Object[]{BubbleSort.class});
        list.add(new Object[]{MergeSort.class});
        list.add(new Object[]{QuickSort.class});

        return list;
    }

    @Parameter
    public Class clazz;

    @Test
    public void sortsRandomListOfThree() throws Exception {
        Integer[] objects = new Integer[3];

        objects[0] = 2;
        objects[1] = 0;
        objects[2] = 1;

        Sorter sorter = (Sorter) clazz.getConstructor().newInstance();

        sorter.sort(objects);

        assertThat(objects[0], is(0));
        assertThat(objects[1], is(1));
        assertThat(objects[2], is(2));
    }

    @Test
    public void sortsRandomListOfTen() throws Exception {
        Integer[] objects = new Integer[10];

        objects[0] = 2;
        objects[1] = 0;
        objects[2] = 1;
        objects[3] = 9;
        objects[4] = 5;
        objects[5] = 3;
        objects[6] = 7;
        objects[7] = 4;
        objects[8] = 6;
        objects[9] = 8;

        Sorter sorter = (Sorter) clazz.getConstructor().newInstance();

        sorter.sort(objects);

        assertThat(objects[0], is(0));
        assertThat(objects[1], is(1));
        assertThat(objects[2], is(2));
        assertThat(objects[3], is(3));
        assertThat(objects[4], is(4));
        assertThat(objects[5], is(5));
        assertThat(objects[6], is(6));
        assertThat(objects[7], is(7));
        assertThat(objects[8], is(8));
        assertThat(objects[9], is(9));
    }

    @Test
    public void sortsRandomListOf100() throws Exception {
        Integer[] objects = new Integer[100];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = (int) (Math.random() * 100);
        }

        Sorter sorter = (Sorter) clazz.getConstructor().newInstance();

        sorter.sort(objects);

        for (int i = 0; i < objects.length - 1; i++) {
            assertTrue(objects[i] <= objects[i + 1]);
        }
    }
}
