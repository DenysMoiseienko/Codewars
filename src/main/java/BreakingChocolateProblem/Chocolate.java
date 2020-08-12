package BreakingChocolateProblem;

public class Chocolate {

  public static int breakChocolate(int n, int m){

    if((n > 1 && m > 1) || (n > 1 && m == 1) || (n == 1 && m > 1)){
      return n * m - 1;
    }
    return 0;
  }
}
