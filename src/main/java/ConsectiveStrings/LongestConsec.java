package ConsectiveStrings;

import java.util.Arrays;

public class LongestConsec {

  public static String longestConsec(String[] strarr, int k) {

    if (k <= 0 || strarr.length == 0 || k > strarr.length) {
      return "";
    }

    String result = "";

    for (int i = 0; i < strarr.length; i++){
      String[] tmpArr = Arrays.copyOfRange(strarr, i, i + k);
      if (String.join("", tmpArr).length() > result.length()) {
        result = String.join("", tmpArr);
      }
    }

    return result;
  }
}
