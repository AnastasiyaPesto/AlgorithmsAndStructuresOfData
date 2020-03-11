package ru.zentsova.lesson1;

public class ExtensionMathUtils {
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
