package CountIPAddresses;

public class CountIPAddresses {

  public static long ipsBetween(String start, String end) {
    return convertToLong(end) - convertToLong(start);
  }

  private static long convertToLong(String ip) {
    long res = 0;
    for (String s : ip.split("[.]") )
      res = res * 256 + Long.parseLong(s);
    return res;
  }
}