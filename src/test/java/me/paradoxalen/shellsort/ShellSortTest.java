package me.paradoxalen.shellsort;

import me.paradoxalen.util.ListGenerator;
import static org.junit.Assert.*;

import me.paradoxalen.util.SortUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShellSortTest {
    private ShellSort shellSort;

    @Before
    public void setUp() {
        shellSort = new ShellSort();
    }

    @After
    public void tearDown() {
        shellSort = null;
    }

    @Test
    public void sortZeroElem() {
        Integer[] array = ListGenerator.getRandomIntegerArray(0, -1000, 100);
        shellSort.sort(array, Integer::compareTo);
        assertTrue(SortUtil.isSorted(array, Integer::compareTo));
    }

    @Test
    public void sortOneElem() {
        Integer[] array = ListGenerator.getRandomIntegerArray(1, -1000, 100);
        shellSort.sort(array, Integer::compareTo);
        assertTrue(SortUtil.isSorted(array, Integer::compareTo));
    }

    @Test
    public void sortNegativeNumberElem() {
        Integer[] array = ListGenerator.getRandomIntegerArray(-1, -1000, 100);
        shellSort.sort(array, Integer::compareTo);
        assertTrue(SortUtil.isSorted(array, Integer::compareTo));
    }
}