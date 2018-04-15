package me.paradoxalen.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    public static List<Integer> getIntegerList(Path path) throws IOException {
        List<Integer> list = new ArrayList<>();
        Files.lines(path).forEach(s -> list.add(Integer.parseInt(s)));
        return list;
    }

    public static List<Integer> getRandomIntegerList(int size, int low, int high) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int key = random.nextInt(high - low + 1) + low;
            list.add(key);
        }
        return list;
    }
    public static List<Integer> getRandomIntegerList(int size) {
        return getRandomIntegerList(size, 0, 100);
    }

    public static Integer[] getRandomIntegerArray(int size, int low, int high) {
        Integer[] array = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int key = random.nextInt(high - low + 1) + low;
            array[i] = key;
        }
        return array;
    }

    public static Integer[] getRandomIntegerArray(int size) {
        return getRandomIntegerArray(size, 0, 100);
    }
}
