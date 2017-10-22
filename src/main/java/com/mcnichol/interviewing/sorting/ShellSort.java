package com.mcnichol.interviewing.sorting;

public class ShellSort implements Sorter {

    @Override
    public void sort(Integer[] objectsToSort) {
        int currentGap = 1;
        //Set the starting gap that is less than size/3   (1, 4, 13, 40...)
        while (getInitialGap(currentGap) < objectsToSort.length / 3) {
            currentGap = getInitialGap(currentGap);
        }

        // Iterate gap down (/=3) until reaching gap of 1 which is essentially insertion sort
        // and guarantees sorted  (But will have most of array sorted by that time improving efficiency)
        while (currentGap > 0) {

            //Set i to zero-indexed currentGap and go till end of array
            for (int i = currentGap - 1; i < objectsToSort.length; i++) {

                //Get value at first position of current gap
                Integer s = objectsToSort[i];

                int j;

                // Start at first occurrence of gap
                for (j = i; j >= currentGap && (objectsToSort[j - currentGap].compareTo(s) > 0); j -= currentGap) {
                    objectsToSort[j] = objectsToSort[j - currentGap];
                }

                objectsToSort[j] = s;
            }
            currentGap /= 3;
        }
    }

    private int getInitialGap(int h) {
        return h * 3 + 1;
    }

    @Override
    public Integer[] peek() {
        return new Integer[0];
    }
}
