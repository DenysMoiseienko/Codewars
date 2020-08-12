package BreakingChocolateProblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateTest {

  @Test
  public void myTests() {
    assertEquals(24, Chocolate.breakChocolate(5, 5));
    assertEquals(0, Chocolate.breakChocolate(1, 1));
  }

}