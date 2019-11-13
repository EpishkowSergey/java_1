package ru.progwards.sergey;

public class HelloWorld {
    static void println(String str) {
        System.out.println(str);
    }

    static int addition(int x, int y) {
        return x + y;
    }

    static int addition1(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        println("Привет, Мир!");
        println("Мир, ты слышишь меня?");
        System.out.print("Я знаю, что 5 + 7 = ");
        System.out.println(addition(5, 7));

    }
}
