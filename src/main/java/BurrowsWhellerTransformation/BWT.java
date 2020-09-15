package BurrowsWhellerTransformation;

import java.util.Objects;

public class BWT {
  public String s;
  public int n;

  public BWT(String s, int n) {
    this.s = s;
    this.n = n;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BWT bwt = (BWT) o;
    return n == bwt.n &&
            Objects.equals(s, bwt.s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s, n);
  }

  @Override
  public String toString() {
    return "BWT{" +
            "s='" + s + '\'' +
            ", n=" + n +
            '}';
  }
}
