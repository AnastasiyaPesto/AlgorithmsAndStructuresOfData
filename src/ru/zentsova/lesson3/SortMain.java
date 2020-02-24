package ru.zentsova.lesson3;

import java.util.Arrays;

public class SortMain {
  public static void main(String[] args) {
     int[] arr = new int[]{3, 2, 0, 2, 2, 3, 3, 4, 8, 5, 1, 4, 6, 7};
    System.out.println(Arrays.toString(arr));
    Sort.counting(arr);
    System.out.println(Arrays.toString(arr));
  }
}
