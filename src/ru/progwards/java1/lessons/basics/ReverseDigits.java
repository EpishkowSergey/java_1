package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a = (number % 10) * 100;
        number = number / 10;
        int b = (number % 10) * 10;
        int c = number / 10;
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
}
