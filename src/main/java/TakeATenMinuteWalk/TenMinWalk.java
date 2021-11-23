package TakeATenMinuteWalk;

public class TenMinWalk {

  public static boolean isValid(char[] walk) {

    if (walk.length != 10) {
      return false;
    }

    int x = 0;
    int y = 0;

    for (Character c : walk) {
      if (c == 'n') {
        y++;
      } else if (c == 's') {
        y--;
      } else if (c == 'e') {
        x--;
      } else {
        x++;
      }
    }
    return x == 0 && y == 0;
  }
}