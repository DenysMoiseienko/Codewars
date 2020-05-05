package SortTheOdd;

import java.util.Arrays;

public class Kata {

  public static int[] sortArray(int[] array) {

    int[] arr = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
    int count = 0;

    for (int i = 0; i < array.length; i++){
      if(array[i] % 2 == 1){
        array[i] = arr[count];
        count++;
      }
    }
    return array;
  }
}
