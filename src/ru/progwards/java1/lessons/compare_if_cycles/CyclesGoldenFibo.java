package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        if (number < 0) {
            number = number * -1;
        }

        while (number > 9) {
            int n = number % 10;
            if (n == digit) {
                return true;
            }
            number = number / 10;
        }

        if (number == digit) {
            return true;
        }
        else {
            return false;
        }
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

        boolean itIsGold = false;

        double a1 = (double)a;
        double b1 = (double)b;
        double c1 = (double)c;

        if (a == b) {
            if ((a1 / c1 > 1.61703) && (a1 / c1 < 1.61903)) {
                itIsGold = true;
            }
        }

        if (a == c) {
            if ((a1 / b1 > 1.61703) && (a1 / c1 < 1.61903)) {
                itIsGold = true;
            }
        }

        if (b == c) {
            if ((b1 / a1 > 1.61703) && (b1 / a1 < 1.61903)) {
                itIsGold = true;
            }
        }

        return itIsGold;
    }

    public static void main(String[] args) {
        System.out.println(isGoldenTriangle(100, 1, 100));

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
