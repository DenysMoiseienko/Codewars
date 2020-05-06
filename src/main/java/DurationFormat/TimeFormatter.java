package DurationFormat;

import java.util.*;
import java.util.stream.Collectors;

public class TimeFormatter {
  public static String formatDuration(int seconds) {

    List<String> list = new ArrayList<>();

    if(seconds <= 0){
      return "now";
    }

    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(31536000, " year");
    map.put(86400, " day");
    map.put(3600, " hour");
    map.put(60, " minute");
    map.put(1, " second");

    for (Map.Entry<Integer, String> entry : map.entrySet()){
      if (seconds >= entry.getKey()){
        int n = seconds / entry.getKey();
        list.add(pluralize(entry.getValue(), n));
        seconds -= n * entry.getKey();
      }
    }

    return list.stream().collect(Collectors.joining(", "))
            .replaceAll(", (?!.+,)", " and ");

  }

  static String pluralize (String word, int n){
    if (n == 1){
      return n + word;
    }else {
      return n + word + "s";
    }
  }
}


