package ru.zentsova.Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

class StrUtilsTest {

  @ParameterizedTest
  @ValueSource(strings = {"madam"})
  void testIsPalindrome_positive(String value) {
    Assertions.assertTrue(StrUtils.isPalindrome(value));
  }

  @ParameterizedTest
  @ValueSource(strings = {""})
  void testIsPalindrome_negative(String value) {
    Assertions.assertFalse(StrUtils.isPalindrome(value));
  }
}