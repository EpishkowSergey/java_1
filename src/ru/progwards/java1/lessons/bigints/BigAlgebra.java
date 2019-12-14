package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.abs;

public class BigAlgebra {
    BigDecimal fastPow(BigDecimal num, int pow) {
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

    BigInteger fibonacci(int n) {
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
        System.out.println(bigAlgebra.fastPow(new BigDecimal(100),-1));
        System.out.println(bigAlgebra.fibonacci(5));
    }

}
