package com.mcnichol.interviewing.sorting;

public class InsertionSort implements Sorter {
    @Override
    public void sort(Integer[] objectToSort) {

        for (int i = 0; i < objectToSort.length; i++) {
            for (int j = i; j > 0; j--) {
                if (objectToSort[j] < objectToSort[j - 1]) {
                    int temp = objectToSort[j];
                    objectToSort[j] = objectToSort[j - 1];
                    objectToSort[j - 1] = temp;
                } else break;

            }
        }
    }
}