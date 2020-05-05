package BallUpwards;

public class Ball {
  public static int maxBall(int v0) {

    double v = (double) v0 * 1000 / 3600;
    double time = 0.0;
    double result = 0;
    int count = 0;

    while (true){
      double h = getH(v, time);
      time += 0.1;

      if(h < result){
        return count - 1;
      }
      count += 1;
      result = h;
    }
  }

  static double getH(double v, double time){
    return (v * time) - (0.5 * 9.81 * time * time);
  }
}
