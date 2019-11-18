package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a >= b && a >= c) {
                return a;
            }
            else if (b >= a && b >= c){
                return b;
            }
            else {
                return c;
        }
    }

    public static int minSide(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= a && b <= c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;

    }

    public static void main(String[] args) {
        System.out.println(maxSide(3,3,1));
        System.out.println(minSide(2,2,5));
        System.out.println(isEquilateralTriangle(1,2,3));
        System.out.println(isEquilateralTriangle(3,3,3));
    }
}
