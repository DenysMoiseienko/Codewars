package TakeATenMinuteWalk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

  @Test
  public void Test() {
    assertTrue(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}), "Should return true");
    assertFalse(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}), "Should return false");
    assertFalse(TenMinWalk.isValid(new char[] {'w'}), "Should return false");
    assertFalse(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}), "Should return false");
  }
}