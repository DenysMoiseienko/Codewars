package FindTheParityOutlier;

import java.util.stream.IntStream;

public class FindOutlier {

  static int find(int[] integers){

     int[] even = IntStream.of(integers).filter(e -> e % 2 == 0).toArray();
     int[] odd = IntStream.of(integers).filter(e -> e % 2 != 0).toArray();

     return even.length < odd.length ? even[0] : odd[0];
  }
}
