package ru.zentsova.lesson1;

public class MathUtils {

    public static int rotate(int num) {
        int n1 = num;
        int result = 0;
        int digit;
        while (n1 > 0) {
            digit = n1 % 10;
            n1 = n1 / 10;
            result = result * 10;
            result = result + digit;
        }
        return result;
    }

    public static long exponentiation(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        int squareOfNum = a * a;
        if (b == 2)
            return squareOfNum;
        boolean isEven  = false;
        if (b % 2 == 0) {
            isEven = true;
        }
        long result = 1;
        if (!isEven) {
            result = a;
        }
        int k;
        k = b;
        while ( k > 1) {
            result = result * squareOfNum;
            k = k - 2;
        }
        return result;
    }

    /**
     * Вычислить факторил (рекурсивный способ)
     */
    public static int calcFactorialRecursion(int n) {
        if (n <= 1)
            return n;
        else
            return n * calcFactorialRecursion(n - 1);
    }

    /**
     * Вычислить факторил (итеративный способ)
     */
    public static int calcFactorialIter(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calcNumbersOfFibonacci(int n) {
        if (n <= 1)
            return n;
        return calcNumbersOfFibonacci(n - 1) + calcNumbersOfFibonacci(n - 2);
    }

}
