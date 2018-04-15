package me.paradoxalen.util;


import me.paradoxalen.shellsort.Sort;

import java.util.Comparator;
import java.util.List;

public class SortTimer {
    public static <T> long getSortingTimeMillis(Sort sort, List<T> source, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        sort.sort(source, comparator);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static <T> long getSortingTimeMillis(Sort sort, T[] source, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        sort.sort(source, comparator);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static <T> long getSortingTimeNano(Sort sort, List<T> source, Comparator<T> comparator) {
        long start = System.nanoTime();
        sort.sort(source, comparator);
        long end = System.nanoTime();
        return end - start;
    }

    public static <T> long getSortingTimeNano(Sort sort, T[] source, Comparator<T> comparator) {
        long start = System.nanoTime();
        sort.sort(source, comparator);
        long end = System.nanoTime();
        return end - start;
    }
}
