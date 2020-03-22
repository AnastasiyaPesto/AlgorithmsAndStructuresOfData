package ru.zentsova.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

  @Test
  public void qsort() {
    int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
    Sort.qsort(array, 0, array.length - 1);
    Assertions.assertArrayEquals(new int[]{-3, 0, 3, 4, 7, 7, 8, 10, 12}, array);
  }

}