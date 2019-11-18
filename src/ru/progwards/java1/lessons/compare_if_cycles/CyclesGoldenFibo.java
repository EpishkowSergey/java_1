package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        if (number < 0) {
            number = number * -1;
        }

        do {
            int n = number % 10;
            if (n == digit) {
                return true;
            }
            number = number / 10;
        }
        while (number > 0);

        return false;
    }

    public static int fiboNumber(int n) {
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
        return f;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        final double n1 = 1.61703;
        final double n2 = 1.61903;

        boolean itIsGold = false;

        double a1 = (double)a;
        double b1 = (double)b;
        double c1 = (double)c;

        double findGoldNumberC = a1 / c1;
        double findGoldNumberB = a1 / b1;
        double findGoldNumberA = b1 / a1;

        if (a == b) {
            if (findGoldNumberC > n1 && findGoldNumberC < n2) {
                itIsGold = true;
            }
        }

        if (a == c) {
            if (findGoldNumberB > n1 && findGoldNumberB < n2) {
                itIsGold = true;
            }
        }

        if (b == c) {
            if (findGoldNumberA > n1 && findGoldNumberA < n2) {
                itIsGold = true;
            }
        }

        return itIsGold;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(-123, 3));

        System.out.println(isGoldenTriangle(89, 55, 89));

        for (int i = 1; i <= 15; i++) {
            System.out.println(fiboNumber(i));
        }

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100 ; j++) {
                for (int k = 1; k <= 100 ; k++) {
                    if (TriangleInfo.isTriangle(i, j, k) && TriangleInfo.isIsoscelesTriangle(i, j, k) && isGoldenTriangle(i, j, k)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

    }
}
