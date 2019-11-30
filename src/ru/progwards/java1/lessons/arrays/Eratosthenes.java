package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        this.sieve = new boolean[N];
        Arrays.fill(sieve, true);
        shift();
    }

    private void shift() {
//       Неделю думал, ни фига не понял что конкретно этом метод должен делать!!!
    }
}
