package me.paradoxalen.shellsort;

import java.util.Comparator;

public class ShellSort implements Sort {

    @Override
    public <T> void sort(T[] array, Comparator<? super T> comparator) {
        for (int d = array.length; d > 0; d /= 2) {
            insertionSort(array, comparator, d, d);
        }
    }

    private <T> void insertionSort(T[] array, Comparator<? super T> comparator, int low, int inc) {
        for (int i = low + inc; i < array.length; i++) {
            T key = array[i];
            int j = i - low;
            while (j >= 0 && comparator.compare(array[j], key) > 0) {
                array[j + inc] = array[j];
                j -= inc;
            }
            array[j + inc] = key;
        }
    }
}
