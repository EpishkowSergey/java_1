package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Finder {
    public static Collection<Integer> findMinSumPair(Collection<Integer> numbers) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>) numbers;

        List<Integer> result = new ArrayList<>();
        result.add(arrayList.get(0));
        result.add(arrayList.get(1));
        Integer sum = arrayList.get(0) + arrayList.get(1);
        int index1 = 0;
        int index2 = 1;

        for (int i = 1; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) + arrayList.get(i + 1) < sum) {
                sum = arrayList.get(i) + arrayList.get(i + 1);
                result.set(0, arrayList.get(i));
                result.set(1, arrayList.get(i + 1));
                index1 = i;
                index2 = i + 1;
            }
        }

        result.set(0, index1);
        result.set(1, index2);

        return result;
    }

    public static Collection<Integer> findLocalMax(Collection<Integer> numbers) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>) numbers;

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) > arrayList.get(i - 1) && arrayList.get(i) > arrayList.get(i + 1)) {
                result.add(arrayList.get(i));
            }
        }

        return result;
    }

    public static boolean findSequence(Collection<Integer> numbers) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>) numbers;

        for (int i = 1; i <= arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) != i) {
                    return false;
                }
            }
        }

        return true;
    }

    public static String findSimilar(Collection<String> names) {
        ArrayList<String> arrayList = (ArrayList<String>) names;

        String name = "";
        int num = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            int count = 0;

            for (int j = i; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    count++;
                }
                else {
                    break;
                }
            }

            if (str.equals(name) && num < count) {
                num = count;
            }

            if (!str.equals(name) && num < count) {
                name = str;
                num = count;
            }

        }

        return name + ":" + num;
    }
}
