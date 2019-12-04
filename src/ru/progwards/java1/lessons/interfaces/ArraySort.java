package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class ArraySort {
    public static void sort(Comparable<Animal>[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int n;
                if (a[i] > a[j]) {
                    n = a[i];
                    a[i] = a[j];
                    a[j] = n;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 3, 1, 0, -2};

        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println(Arrays.toString(array));
    }
}
