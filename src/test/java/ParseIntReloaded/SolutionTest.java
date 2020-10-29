package ParseIntReloaded;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @Test
  public void fixedTests() {
    assertEquals(1 , Parser.parseInt("one"));
    assertEquals(20 , Parser.parseInt("twenty"));
    assertEquals(46 , Parser.parseInt("forty-six"));
    assertEquals(246 , Parser.parseInt("two hundred forty-six"));
    assertEquals(1246 , Parser.parseInt("one thousand two hundred forty-six"));
    assertEquals(5001 , Parser.parseInt("five thousand and one"));
    assertEquals(5101 , Parser.parseInt("five thousand one hundred and one"));
    assertEquals(5000 , Parser.parseInt("five thousand"));
    assertEquals(783919 , Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
    assertEquals(700000 , Parser.parseInt("seven hundred thousand"));
    assertEquals(117000 , Parser.parseInt("one hundred seventeen thousand"));
    assertEquals(700019 , Parser.parseInt("seven hundred thousand and nineteen"));
    assertEquals(701019 , Parser.parseInt("seven hundred one thousand and nineteen"));
    assertEquals(711019 , Parser.parseInt("seven hundred eleven thousand and nineteen"));
    assertEquals(3919 , Parser.parseInt("three thousand nine hundred and nineteen"));
    assertEquals(1000000 , Parser.parseInt("one million"));
    assertEquals(0 , Parser.parseInt("zero"));
  }
}