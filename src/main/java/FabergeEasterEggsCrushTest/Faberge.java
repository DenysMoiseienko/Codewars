package FabergeEasterEggsCrushTest;

import java.math.BigInteger;

public class Faberge {

  public static BigInteger height(BigInteger n, BigInteger m) {
    BigInteger temp = BigInteger.ONE;
    BigInteger result = BigInteger.ZERO;
    BigInteger i = BigInteger.ONE;

    while (i.compareTo(n) <= 0) {
      temp = temp.multiply(m.subtract(i).add(BigInteger.ONE)).divide(i);
      result = result.add(temp);
      i = i.add(BigInteger.ONE);
    }
    return result;
  }
}
