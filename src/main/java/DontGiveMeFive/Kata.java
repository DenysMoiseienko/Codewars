package DontGiveMeFive;

import java.util.stream.IntStream;

public class Kata {

  public static int dontGiveMeFive(int start, int end)
  {
    int result = (int) IntStream.range(start, end + 1).filter(e -> !String.valueOf(e).contains("5")).count();
    return result;
  }
}
