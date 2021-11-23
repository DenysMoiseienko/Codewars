package RailFenceCipher;

public class RailFenceCipher {

  private static int getTerm(int iteration, int row, int size) {
    if ((size == 0) || (size == 1)) return 1;
    if((row == 0) || (row == size-1)) return (size - 1) * 2;
    if (iteration % 2 == 0) return (size - 1 - row) * 2;
    return 2 * row;
  }

  static String encode(String s, int n) {

    StringBuilder result = new StringBuilder();

    for (int row = 0; row < n; row++) {
      int iteration = 0;
      for (int i = row; i < s.length(); i += getTerm(iteration++, row, n)) {
        result.append(s.charAt(i));
      }
    }
      return result.toString();
    }

  static String decode(String s, int n) {

    StringBuilder decodedMessage = new StringBuilder(s);

    int currPosition = 0;

    for(int row = 0; row < n; row++) {
      int iteration = 0;
      for(int i = row; i < s.length(); i += getTerm(iteration++, row, n)) {
        decodedMessage.setCharAt(i, s.charAt(currPosition++));
      }
    }
    return decodedMessage.toString();
  }
}