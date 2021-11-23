package ComplementaryDNA;

public class DnaStrand {

  public static String makeComplement(String dna) {

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < dna.length(); i++) {
      if (dna.charAt(i) == 'A') {
        result.append("T");
      } else if (dna.charAt(i) == 'T') {
        result.append("A");
      } else if (dna.charAt(i) == 'C') {
        result.append("G");
      } else {
        result.append("C");
      }
    }
    return result.toString();
  }
}
