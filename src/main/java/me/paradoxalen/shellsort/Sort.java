package me.paradoxalen.shellsort;

import java.util.Comparator;
import java.util.List;

public interface Sort {
    <T> void sort(List<T> list, Comparator<? super T> comparator);
    <T> void sort(T[] array, Comparator<? super T> comparator);
}
