package ru.zentsova.lesson3;

public class Sort {

  /**
   * Сортировка вставками
   * @param array
   */
  public static void insertion(int[] array) {
    if (array == null || array.length < 2)
      return;

    int tmp;
    int i = 0;
    while (i < array.length) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[i]) {
          tmp = array[i];
          for (int k = i; k > j; k--) {
            array[k] = array[k - 1];
          }
          array[j] = tmp;
          break;
        }
      }
      i++;
    }
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

}
