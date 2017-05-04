package com.mcnichol.interviewing.sorting;

public class SelectionSort implements Sorter {
    @Override
    public void sort(Integer[] objectToSort) {
        int length = objectToSort.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (objectToSort[min] > objectToSort[j]) {
                    min = j;
                }
            }

            swap(objectToSort, i, min);
        }
    }

    @Override
    public Integer[] peek() {
        return new Integer[0];
    }

    private void swap(Integer[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
