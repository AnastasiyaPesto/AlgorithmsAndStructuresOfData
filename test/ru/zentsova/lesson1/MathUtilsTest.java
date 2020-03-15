package ru.zentsova.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

  @Test
  public void tesFindMedian() {
    Assertions.assertEquals(2, MathUtils.findMedian(1,2,3));
    Assertions.assertEquals(2, MathUtils.findMedian(2,2,3));
    Assertions.assertEquals(2, MathUtils.findMedian(2,2,2));
    Assertions.assertEquals(7, MathUtils.findMedian(10,7,3));
    Assertions.assertEquals(7, MathUtils.findMedian(7,3,10));
  }

}