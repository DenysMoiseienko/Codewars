package SquareEveryDigit;

public class SquareDigit {

  public int squareDigits(int n) {

    char[] digits = Integer.toString(n).toCharArray();

    StringBuilder result = new StringBuilder();

    for (char digit : digits) {
      int i = (int) Math.pow(Character.getNumericValue(digit), 2);
      result.append(i);
    }

    return Integer.parseInt(result.toString());
  }
}