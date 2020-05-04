package deleteOccurrences;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {

    Map<Integer, Integer> instances = new HashMap<>();

    return IntStream.of(elements).filter(e -> instances.merge(e, 1, Integer::sum) <= maxOccurrences).toArray();
  }
}