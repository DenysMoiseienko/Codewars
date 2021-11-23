package EscapingTheMatrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MatrixTest {

  @Test
  public void test() {
    assertThrows(Neo.class, Matrix::enter);
  }
}