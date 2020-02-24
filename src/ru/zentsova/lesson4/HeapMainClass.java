package ru.zentsova.lesson4;

import java.util.Arrays;

public class HeapMainClass {
  public static void main(String[] args) {
    int[] arr = new int[] {100,1,8,15,7,3,199,1,5,1,1};
    System.out.println(Arrays.toString(arr));
    final int[] mins = Heap.hepifyMin(arr, 5);
    System.out.println(Arrays.toString(mins));
  }
}
