package ValidBraces;

public class BraceChecker {

  public boolean isValid(String braces) {

    String str = braces;

    for (int i = 0; i < braces.length() / 2; i++) {
      str = str.replaceAll("\\(\\)", "");
      str = str.replaceAll("\\[\\]", "");
      str = str.replaceAll("\\{\\}", "");
      if (str.length() == 0)
        return true;
    }
    return false;
  }

}
