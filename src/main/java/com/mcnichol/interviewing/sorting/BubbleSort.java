package com.mcnichol.interviewing.sorting;

public class BubbleSort implements Sorter {

    private Integer[] state;

    @Override
    public void sort(Integer[] objectsToSort) {
        this.state = objectsToSort;

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < objectsToSort.length - 1; i++) {
                if (objectsToSort[i] > objectsToSort[i + 1]) {
                    int temp = objectsToSort[i];
                    objectsToSort[i] = objectsToSort[i + 1];
                    objectsToSort[i + 1] = temp;

                    sorted = false;
                }
            }
        }
    }

    @Override
    public Integer[] peek() {
        return state;
    }
}
