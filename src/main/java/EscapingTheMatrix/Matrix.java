package EscapingTheMatrix;

public class Matrix {

  public static void enter() {
    Matrix.<RuntimeException>escape();
  }

  public static <T extends Throwable> void escape() throws T {
    throw (T) new Neo();
  }
}