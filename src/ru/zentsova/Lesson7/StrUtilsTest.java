package ru.zentsova.Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class StrUtilsTest {

  @ParameterizedTest
  @ValueSource(strings = {"Q", "madam", "Do geese see God?", "Madam, I’m Adam", "able was I ere I saw elba"})
  void testIsPalindrome_positive(String value) {
    Assertions.assertTrue(StrUtils.isPalindrome(value));
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"levelup"})
  void testIsPalindrome_negative(String value) {
    Assertions.assertFalse(StrUtils.isPalindrome(value));
  }
}