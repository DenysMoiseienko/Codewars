package YourOrderPlease;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
  public static String order(String words) {

    return Stream.of(words.split(" ")).sorted(Comparator.comparingInt(Order::intFromWord))
            .collect(Collectors.joining(" "));
  }

   static int intFromWord(String word){
    for (char ch : word.toCharArray()) {
       if(Character.isDigit(ch)) return ch;
    }
    return 0;
  }
}
