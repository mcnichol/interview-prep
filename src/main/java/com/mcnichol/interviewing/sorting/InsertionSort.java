package com.mcnichol.interviewing.sorting;

public class InsertionSort implements Sorter {
    @Override
    public void sort(Integer[] objectToSort) {
        for (int i = 0; i < objectToSort.length; i++) {
            for (int j = i; j > 0; j--) {
                if (objectToSort[j] < objectToSort[j - 1]) {
                    swap(objectToSort, j - 1, j);
                } else break;
            }
        }
    }

    private void swap(Integer[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    @Override
    public Integer[] peek() {
        return new Integer[0];
    }
}