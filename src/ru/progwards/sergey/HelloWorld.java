package ru.progwards.sergey;

public class HelloWorld {
    static void println(String str) {
        System.out.println(str);
    }

    static int addition(int x, int y) {
        return x + y;
    }

    static long factorial(long n) {
        long f = 1L;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


    public static void main(String[] args) {
        println("Привет, Мир!");
        println("Мир, ты слышишь меня?");
        System.out.print("Я знаю, что 5 + 7 = ");
        System.out.println(addition(5, 7));

        long n = 10;
        long f = 1;
        long i = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }
        System.out.println(f);
    }
}
