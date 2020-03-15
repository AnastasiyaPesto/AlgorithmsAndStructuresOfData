package ru.zentsova.lesson3;

import java.util.Arrays;

public class SortMain {
  public static void main(String[] args) {
     int[] arr = new int[]{8, 7, 5, 9, 1, 6};
    System.out.println(Arrays.toString(arr));
    Sort.insertion(arr);
    System.out.println(Arrays.toString(arr));
  }
}
