package ru.zentsova.Lesson7;

public class StrUtils {
  public static boolean isPalindrome(String str) {
    if (str == null || str.isEmpty())
      return false;
    int firstInd = 0;
    int lastInd = str.length() - 1;
    // "Do geese see God?"
//    for (int i = 0; i < str.length(); i++)
    while (firstInd != lastInd) {
      if (str.charAt(firstInd) != str.charAt(lastInd))
        return false;
      firstInd++;
      lastInd--;
    }
    return true;
  }
}
