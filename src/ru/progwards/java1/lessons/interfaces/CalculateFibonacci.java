package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        int fibo = 0;
        if (n == CalculateFibonacci.lastFibo.n) {
            fibo = CalculateFibonacci.lastFibo.fibo;
        }
        else {
            if (n == 1 || n == 2) {
                return 1;
            }

            int a = 1;
            int b = 1;
            int f = 0;
            for (int i = 2; i < n; i++) {
                f = a + b;
                a = b;
                b = f;
            }
            CalculateFibonacci.lastFibo.fibo = f;
        }
        return fibo;
    }

    static class CacheInfo {
        int n;
        int fibo;
    }
}
