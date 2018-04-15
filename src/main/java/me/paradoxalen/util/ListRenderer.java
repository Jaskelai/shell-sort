package me.paradoxalen.util;

import java.util.List;

public class ListRenderer {

    public static void render(List<? extends Number> list) {
        render(list, " ");
    }

    public static void render(List<? extends Number> list, String delimiter) {
        for (int i = 0; i < list.size(); i++) {
            String output = list.get(i).toString();
            if (i != list.size() - 1) {
                System.out.print(output + delimiter);
            } else {
                System.out.println(output);
            }
        }
    }

    public static void render(Integer[] array, String delimiter) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i].toString() + delimiter);
            } else {
                System.out.println(array[i]);
            }
        }
    }

}
