package com.mcnichol.interviewing.sorting;

public class MergeSort implements Sorter {

    private Integer[] state;

    @Override
    public void sort(Integer[] objects) {
        this.state = objects;

        Integer[] aux = new Integer[objects.length];

        mergesort(objects, aux, 0, objects.length - 1);
    }

    private void mergesort(Integer[] arr, Integer[] aux, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mergesort(arr, aux, low, mid); // Sort left half
        mergesort(arr, aux, mid + 1, high); // Sort right half
        peek();
        merge(arr, aux, low, mid, high); // Merge them
    }

    private void merge(Integer[] arr, Integer[] aux, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            aux[i] = arr[i];
        }

        int auxLeft = low;
        int auxRight = mid + 1;
        int index = low;

        while (auxLeft <= mid && auxRight <= high) {
            if (aux[auxLeft] <= aux[auxRight]) {
                arr[index] = aux[auxLeft];
                auxLeft++;
            } else {
                arr[index] = aux[auxRight];
                auxRight++;
            }
            index++;
        }

        int remaining = mid - auxLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[index + i] = aux[auxLeft + i];
        }
    }


    @Override
    public Integer[] peek() {

        for (int i = 0; i < state.length; i++) {
            System.out.print(state[i] + " ");
        }
        System.out.println();

        return null;
    }
}
