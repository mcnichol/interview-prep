package com.mcnichol.interviewing.sorting;

public class QuickSort implements Sorter {
    private Integer[] state;

    @Override
    public void sort(Integer[] objects) {
        this.state = objects;

        quickSort(state, 0, state.length - 1);
    }

    private void quickSort(Integer[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);

        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private int partition(Integer[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
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
