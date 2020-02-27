package ru.zentsova.lesson4;

public class Heap {
  // Задача 1. Написать функцию heapify(arr).
  
  /**
   * Построить дерево
   * @param arr              массив, из которой необходимо построить двоичную кучу
   */
  public static void heapify(int[] arr, int lenHeap, boolean isMax) {
    if (lenHeap > 1) {
      if (isMax) {
        for (int i = 1; i < lenHeap; i++) {
          siftUp(arr, i);
        }
      } else {
        for (int i = 1; i < lenHeap; i++) {
          siftDown(arr, i);
        }
      }
    }
  }

  private static void swap(int[] arr, int indFirst, int indSecond) {
    int tmp = arr[indFirst];
    arr[indFirst] = arr[indSecond];
    arr[indSecond] = tmp;
  }

  /**
   * Получить индекс родителя
   * @param currentIndex    текущий индекс элемента
   * @return                 индекс родителя
   */
  private static int getParentIndex(int currentIndex) {
    return (currentIndex - 1) / 2;
  }

  /**
   * Просеять значение по индексу вверх
   * @param arr              массив - двоичная куча
   * @param i                индекс элемента
   */
  private static void siftUp(int[] arr, int i) {
    int parentInd = getParentIndex(i);
    while (arr[i] > arr[parentInd]) {
      swap(arr, i, parentInd);
      i = parentInd;
      parentInd = getParentIndex(i);
    }
  }

  /**
   * Просеять значение по индексу вниз
   * @param arr              массив - двоичная куча
   * @param i                индекс элемента
   */
  private static void siftDown(int[] arr, int i) {
    int parentInd = getParentIndex(i);
    while (arr[i] < arr[parentInd]) {
      swap(arr, i, parentInd);
      i = parentInd;
      parentInd = getParentIndex(i);
    }
  }

  // Задача 2. Дан массив целых чисел. Требуется определить является ли он кучей.

  /**
   * Проверить является ли массив двоичной кучей
   * @param arr              массив
   * @return true, если arr двоичная куча, иначе false
   */
  public static boolean isHeap(int[] arr) {
    if (arr.length == 0) {
      return false;
    }
    if (arr.length <= 2) {
      return true;
    }
    int i = 1;
    while (i < arr.length && (arr[i] == arr[i - 1])) {
      i++;
    }
    if (i == arr.length)
      return true;
    if (arr[i] < arr[i - 1]) {
      // куча на максимум
      return isHeapMaxMin(arr, true);
    } else {
      // куча на минимум
      return isHeapMaxMin(arr, false);
    }
  }

  private static boolean isHeapMaxMin(int[] arr, boolean isMax) {
    boolean result =  true;
    int left, right, len;
    len = arr.length;
    for (int i = 0; i < len - 2 && result; i++) {
      left = 2 * i + 1;
      right = 2 * i + 2;
      if (isMax) {
        if (left < len && arr[i] < arr[left]) {
          result = false;
        }
        if (right < len && arr[i] < arr[right]) {
          result = false;
        }
      } else {
        if (left < len && arr[i] > arr[left]) {
          result = false;
        }
        if (right < len && arr[i] > arr[right]) {
          result = false;
        }
      }
    }
    return result;
  }

  // Задача 3. Дан массив целых чисел. Требуется найти k-минимальных элементов;
  public static int[] hepifyMin(int[] arr, int k) {
    int[] heap = null;
    if (arr.length > 0) {
      heap = new int[k];
      // Построили кучу из k элементов
      for (int i = 0; i < k; i++) {
        heap[i] = arr[i];
        siftUp(heap, i);
      }
      for (int i = k; i < arr.length; i++) {
        int j = 0;
        if (heap[j] > arr[i]) {
          heap[j] = arr[i];
          for (; ; ) {
            int leftChild = 2 * j + 1;
            int rightChild = 2 * j + 2;
            int largestChild = j;
            if ((leftChild < heap.length) && (heap[leftChild] > heap[largestChild])) {
              largestChild = leftChild;
            }
            if ((rightChild < heap.length) && (heap[rightChild] > heap[largestChild])) {
              largestChild = rightChild;
            }
            if (largestChild == j) {
              break;
            }
            swap(heap, largestChild, j);
            j = largestChild;
          }
        }
      }
    }
    return heap;
  }

}
