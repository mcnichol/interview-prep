package com.mcnichol.interviewing.sorting;

public class BubbleSort implements Sorter {

    @Override
    public void sort(Integer[] objects) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < objects.length - 1; i++) {
                if (objects[i] > objects[i + 1]) {
                    int temp = objects[i];
                    objects[i] = objects[i + 1];
                    objects[i + 1] = temp;

                    sorted = false;
                }
            }
        }
    }

    @Override
    public Integer[] peek() {
        return new Integer[0];
    }
}
