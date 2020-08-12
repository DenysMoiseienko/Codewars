package DontGiveMeFive;

import static org.junit.Assert.*;
import org.junit.Test;

public class KataTest {
  @Test
  public void exampleTests() {
    assertEquals(8, Kata.dontGiveMeFive(1,9));
    assertEquals(12, Kata.dontGiveMeFive(4,17));
  }

}