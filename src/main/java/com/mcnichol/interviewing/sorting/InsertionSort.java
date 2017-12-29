package com.mcnichol.interviewing.sorting;

public class InsertionSort implements Sorter {
    private Integer[] state;

    @Override
    public void sort(Integer[] objectToSort) {
        this.state = objectToSort;
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
        return state;
    }
}