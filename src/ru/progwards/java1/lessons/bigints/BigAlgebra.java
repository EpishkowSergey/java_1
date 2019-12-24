package ru.progwards.java1.lessons.bigints;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;

import static java.lang.Math.abs;

public class BigAlgebra {
    static BigDecimal fastPow(BigDecimal num, int pow) {
        int powAbs = abs(pow);

        int[] number = new int[32];
        int step = 0;
        for (int i = 0; 0 < powAbs; i++) {
            number[i] = (powAbs % 2);
            powAbs = powAbs / 2;
            step++;
        }
//        System.out.println("кол-во шагов = " + step);
//        System.out.println(Arrays.toString(number));
        int[] number1 = new int[step];
        for (int i = 0; i < step; i++) {
            number1[i] = number[i];
        }
//        System.out.println(Arrays.toString(number1));


        BigDecimal result = new BigDecimal("1");
        BigDecimal z = num;

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] == 1) {
                result = result.multiply(z);
                z = z.pow(2);
            } else {
                z = z.pow(2);
            }
        }

        if (pow < 0) {
            result = BigDecimal.ONE.divide(result, new MathContext(5));
        }

//        System.out.println(result);

        return result;

    }
   /*static BigDecimal fastPow(BigDecimal num, int pow) {
        BigDecimal result = new BigDecimal(1);
        if (pow == 0) {
           return result;
        }

        for (int i = 0; i < abs(pow); i++) {
            result = result.multiply(num);
        }

        if (pow < 0) {
            result = BigDecimal.ONE.divide(result);
        }

        return result;
    }
*/
   static BigInteger fibonacci(int n) {
        BigInteger fibo = new BigInteger(String.valueOf(n));

        if (fibo.compareTo(new BigInteger("1")) == 0 || fibo.compareTo(new BigInteger("2")) == 0) {
            return new BigInteger("1");
        }

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger f = new BigInteger("0");
        for (int i = 2; i < n; i++) {
            f = a.add(b);
            a = b;
            b = f;
        }
        return f;
    }

    public static void main(String[] args) {
        BigAlgebra bigAlgebra = new BigAlgebra();
        System.out.println(bigAlgebra.fastPow(new BigDecimal(21),13));
        System.out.println(bigAlgebra.fibonacci(5));
    }

}
