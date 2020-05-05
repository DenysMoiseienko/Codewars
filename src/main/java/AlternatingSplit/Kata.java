package AlternatingSplit;

public class Kata {

  public static String encrypt(final String text, final int n) {

    if (text == null || text.isEmpty() || n < 0 ) {
      return text;
    }

    String result = text;

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

    if (encryptedText == null || encryptedText.isEmpty() || n < 0 ) {
      return encryptedText;
    }

    String result = encryptedText;

    for (int i = 1; i <= n; i++) {

      String s1 = result.substring(0 , result.length()/2);
      String s2 = result.substring(result.length()/2);
      String temp = "";

      for (int j = 0; j < s2.length(); j++) {
        if(j < s1.length()){
          temp = temp + s2.charAt(j) + s1.charAt(j);
        }else {
          temp = temp + s2.charAt(j);
        }
      }
      result = temp;
    }
    return result;
  }
}
