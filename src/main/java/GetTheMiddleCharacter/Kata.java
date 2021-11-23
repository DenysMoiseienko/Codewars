package GetTheMiddleCharacter;

public class Kata {

  public static String getMiddle(String word) {
    int i = word.length() / 2;

    if (word.length() % 2 == 0) {
      return word.substring(i - 1, i + 1);
    } else {
      return word.charAt(i) + "";
    }
  }
}