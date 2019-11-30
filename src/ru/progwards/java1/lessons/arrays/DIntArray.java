package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] arrayInt;

    public void add(int num) {
        int[] addArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length + 1];
        for (int i = 0; i < arrayInt.length - 1; i++) {
            arrayInt[i] = addArrayInt[i];
        }
        arrayInt[arrayInt.length - 1] = num;
//        System.out.println(Arrays.toString(arrayIntAdd));
    }

    public void atInsert(int pos, int num) {
        int[] arrayIntAtInsert = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
            arrayIntAtInsert[i] = arrayInt[i];
        }

        for (int i = pos + 1; i < arrayIntAtInsert.length; i++) {
            arrayIntAtInsert[i] = arrayInt[i - 1];
        }

        arrayIntAtInsert[pos] = num;

//        System.out.println(Arrays.toString(arrayIntAtInsert));
    }

    public void atDelete(int pos) {
        int[] arrrayIntAtDelete = new int[arrayInt.length - 1];

        for (int i = 0; i < pos; i++) {
            arrrayIntAtDelete[i] = arrayInt[i];
        }

        for (int i = pos + 1; i < arrayInt.length; i++) {
            arrrayIntAtDelete[i - 1] = arrayInt[i];
        }

//        System.out.println(Arrays.toString(arrrayIntAtDelete));
    }

    public int at(int pos) {
        return arrayInt[pos];
    }

    public static void main(String[] args) {
       /* int[] arrayInt = {1, 2, 3, 4};
        DIntArray dIntArray = new DIntArray(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        dIntArray.add(5);
        dIntArray.atInsert(2, 0);
        dIntArray.atDelete(1);
        System.out.println(dIntArray.at(3));
        */
    }

}
