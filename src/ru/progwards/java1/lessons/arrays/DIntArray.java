package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] arrayInt;

    public DIntArray() {
        this.arrayInt = new int[0];
    }

    public void add(int num) {
        int[] addArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length + 1];
        for (int i = 0; i < arrayInt.length - 1; i++) {
            arrayInt[i] = addArrayInt[i];
        }
        arrayInt[arrayInt.length - 1] = num;
    }

    public void atInsert(int pos, int num) {

        int[] atInsertArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
            arrayInt[i] = atInsertArrayInt[i];
        }

        for (int i = pos + 1; i < arrayInt.length; i++) {
            arrayInt[i] = atInsertArrayInt[i - 1];
        }

        arrayInt[pos] = num;
    }

    public void atDelete(int pos) {
        int[] atDeleteArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length - 1];

        for (int i = 0; i < pos; i++) {
            arrayInt[i] = atDeleteArrayInt[i];
        }

        for (int i = pos + 1; i < atDeleteArrayInt.length; i++) {
            arrayInt[i - 1] = atDeleteArrayInt[i];
        }
    }

    public int at(int pos) {
        return arrayInt[pos];
    }

    public static void main(String[] args) {
        DIntArray dIntArray = new DIntArray();
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(0);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(8);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(86);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(96);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(-96);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(7);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(25);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.add(-11);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.atInsert(2,12);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        dIntArray.atDelete(3);
        System.out.println(Arrays.toString(dIntArray.arrayInt));

        System.out.println(dIntArray.at(3));

    }

}
