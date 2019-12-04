package ru.progwards.java1.lessons.interfaces;

import ru.progwards.java1.lessons.compare_if_cycles.CyclesGoldenFibo;

public class CalculateFibonacci {
    static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        int fibo = 0;
        if (n == CalculateFibonacci.lastFibo.n) {
            fibo = CalculateFibonacci.lastFibo.fibo;
        }
        else {
            CalculateFibonacci.lastFibo.fibo = CyclesGoldenFibo.fiboNumber(n);
        }
        return fibo;
    }

    static class CacheInfo {
        int n;
        int fibo;
    }
}
