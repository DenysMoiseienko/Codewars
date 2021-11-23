package ValidBraces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

  private BraceChecker checker = new BraceChecker();

  @Test
  public void testValid() {
    assertTrue(checker.isValid("()"));
  }

  @Test
  public void testValid1() {
    assertTrue(checker.isValid("(){}"));
  }

  @Test
  public void testInvalid() {
    assertFalse(checker.isValid("[(])"));
  }

  @Test
  public void testInvalid2() {
    assertFalse(checker.isValid(")"));
  }
}