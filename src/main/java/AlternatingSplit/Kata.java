package AlternatingSplit;

public class Kata {

  public static String encrypt(final String text, final int n) {

    if (text == null) {
      return null;
    }

    if (text.isEmpty()) {
      return "";
    }

    if (n <= 0) {
      return text;
    }

    String result = "";
    result += text;

    for (int i = 1; i <= n; i++) {

      String s1 = "";
      String s2 = "";
      for (int j = 1; j < result.length(); j += 2) {
        s1 += result.charAt(j);
      }
      for (int j = 0; j < result.length(); j += 2) {
        s2 += result.charAt(j);
      }
      result = s1 + s2;
    }
    return result;
  }


  public static String decrypt(final String encryptedText, final int n) {

    return null;
  }
}
