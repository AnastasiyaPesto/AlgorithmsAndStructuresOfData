package ru.zentsova.lesson1;

import java.util.Random;

public class MathUtils {

  // Задание 1. Даны три числа a,b,c. Требуется найти среди них медиану.
  public static int selection(int[] array, int k) {
    if (k > -1) {
      int len = array.length;
      if (len == 0) {
        return Integer.MAX_VALUE;
      }
      if (len == 1)
        return array[0];
      if (len == 2) {
        return (array[1] >= array[0] ? array[0] : array[1]);
      }
      int pivotInd = new Random().nextInt(len);
      int pivot = array[pivotInd];
      int lessAndEqual = 0;
      int more = 0;
      for (int i = 0; i < len; i++) {
        if (array[i] <= pivot)
          lessAndEqual++;
        else
          more++;
      }
      int[] mas;
      if (k <= (lessAndEqual - 1)) {
        mas = new int[lessAndEqual];
        for (int i = len - 1; i >= 0; i--) {
          if (array[i] <= pivot)
            mas[--lessAndEqual] = array[i];
        }
        return selection(mas, k);
      } else {
        mas = new int[more];
        for (int i = len - 1; i >= 0; i--) {
          if ( array[i] > pivot)
            mas[--more] = array[i];
        }
        return selection(mas, k - lessAndEqual + 1);
      }
    }
    return Integer.MAX_VALUE;
  }

  public static int findMedian(int a, int b, int c) {
    if (a == b || a == c)
      return a;

    if (b == c)
      return b;

    if (a > b) {
      if (b > c)
        return b;
      else if (a > c)
        return c;
      else
        return a;
    } else {
      if (a > c)
        return a;
      else if (b > c)
        return c;
      return b;
    }
  }

  // Задание 2. Дано неотрицательное число. Требуется перевернуть его.
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

  // Доп. задание. Даны два целых неотрицательных числа a, b. Требуется написать функцию возведения в степень a^b;
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

}
