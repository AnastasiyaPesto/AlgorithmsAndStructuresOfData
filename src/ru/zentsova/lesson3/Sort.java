package ru.zentsova.lesson3;

public class Sort {

  /**
   * Сортировка вставками
   * @param array
   */
  public static void insertion(int[] array) {
    if (array == null || array.length < 2)
      return;
    int j;
    for (int i = 1; i < array.length; i++) {
      j = i;
      while (j > 0 && array[j] < array[j - 1]) {
        swap(array, j, j -1);
        j--;
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    if ((i == j) || (arr.length == 0) || (i < 0 || i >= arr.length) || (j < 0 || j >= arr.length))
      return;
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  /**
   * Сортировка выбором
   */
  public static void selection(int[] array) {
    if (array == null || array.length < 2)
      return;

    int k = 0;
    int indexMin;
    int tmp;
    while (k < array.length - 1) {
      indexMin = k;
      for (int i = k + 1; i < array.length; i++) {
        if (array[i] < array[indexMin]) {
          indexMin = i;
        }
      }
      if (indexMin != k) {
        tmp = array[indexMin];
        array[indexMin] = array[k];
        array[k] = tmp;
      }
      k++;
    }
  }

  /**
   * Сортировка подсчетом
   */
  public static void counting(int[] array) {
    int max = getMaxValue(array);
    int[] countArr = new int[max + 1];
    for (int i = 0; i < array.length; i++) {
      countArr[array[i]] += 1;
    }
    int k = 0;
    for (int i = 0; i < countArr.length; i++) {
      for (int j = 0; j < countArr[i]; j++) {
        array[k] = i;
        k++;
      }
    }
  }

  private static int getMaxValue(int[] array) {
    if (array.length > 0) {
      int max = array[0];
      for (int i = 1; i < array.length; i++) {
        if (array[i] > max)
          max = array[i];
      }
      return max;
    }
    return Integer.MAX_VALUE;
  }

  public static void qsort(int[] arr, int low, int high) {
    if (arr.length == 0)
      return;
    if (low >= high)
      return;
    // выбор опорного элемента - середина массива
    int p = arr[low + (high - low) / 2];
    int i = low;
    int j = high;
    while (i <= j) {
      while (arr[i] < p) {
        i++;
      }
      while (arr[j] > p) {
        j--;
      }
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    } ;
    if (low < j)
      qsort(arr, low, j);
    if (high > i)
      qsort(arr, i, high);
  }

}
