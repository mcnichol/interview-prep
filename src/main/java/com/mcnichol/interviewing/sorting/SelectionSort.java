package com.mcnichol.interviewing.sorting;

public class SelectionSort implements Sorter {
    @Override
    public void sort(Integer[] objectToSort) {
        for (int i = 0; i < objectToSort.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < objectToSort.length; j++) {
                if (objectToSort[j] < objectToSort[minPos]) {
                    minPos = j;
                }
            }
            swap(objectToSort, i, minPos);
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
