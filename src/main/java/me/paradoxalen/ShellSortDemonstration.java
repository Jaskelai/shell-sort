package me.paradoxalen;

import me.paradoxalen.shellsort.ShellSort;
import me.paradoxalen.shellsort.Sort;
import me.paradoxalen.util.ListGenerator;
import me.paradoxalen.util.SortTimer;

import java.io.*;

public class ShellSortDemonstration {
    private static final int[] numberElementsArray = {1000, 10000, 100000, 1000000};
    private static final String csvFile = "result.csv";
    private Writer writer;
    private Sort sort;
    private Integer[] array;

    public static void main(String[] args) {
        ShellSortDemonstration demo = new ShellSortDemonstration();
        demo.init();
        demo.start();
    }

    private void init() {
        sort = new ShellSort();
        try {
            writer = new FileWriter(csvFile);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            System.exit(-11);
        }
    }

    private void start() {
        for (int number : numberElementsArray) {
            array = ListGenerator.getRandomIntegerArray(number, Integer.MIN_VALUE / 4, Integer.MAX_VALUE / 4);
            try {
                writer.write(number + ", " + SortTimer.getSortingTimeMillis(sort, array, Integer::compareTo) + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
