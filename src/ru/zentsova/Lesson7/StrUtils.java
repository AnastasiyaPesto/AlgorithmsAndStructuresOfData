package ru.zentsova.Lesson7;

public class StrUtils {
  /**
   * Проверить является ли строка палиндромом
   * @return true, если строка из одного символа или является палиндромом
   * <br/>false, если строка пуста, null или не является палиндромом
   */
  public static boolean isPalindrome(String str) {
    if (str == null || str.isEmpty())
      return false;
    int firstInd = -1;
    int lastInd = str.length();
    while (firstInd != lastInd) {
      do {
        firstInd++;
      } while (!Character.isLetterOrDigit(str.charAt(firstInd)));
      do {
        lastInd--;
      } while (!Character.isLetterOrDigit(Character.toLowerCase(str.charAt(lastInd))));
      if (Character.toLowerCase(str.charAt(firstInd)) != Character.toLowerCase(str.charAt(lastInd)))
        return false;
    }
    return true;
  }

  public static String transform(String str) {
    if (str == null || str.isEmpty() || str.length() == 1)
      return str;
//    String result = str;
//    int i = 0;
//    int j = 1;
//    while (j < str.length()) {
//
//    }
    return str;
  }
}
