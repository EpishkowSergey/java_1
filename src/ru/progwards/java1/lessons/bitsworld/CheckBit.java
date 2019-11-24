package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        int result = 0;

        if (bitNumber > 0) {
            for (int i = 0; i < bitNumber; i++) {
                value >>= 1;
            }
        }

        if ((value & 1) == 1) {
            result = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte) 7, 1));
    }
}
