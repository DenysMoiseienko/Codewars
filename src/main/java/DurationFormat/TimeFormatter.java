package DurationFormat;

import java.util.*;

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

    String result = "";
    for(int i = 0; i < list.size();i ++){
      if(i == 0){
        result += list.get(i);
      }else if(i == list.size() - 1 && list.size() > 1){
        result += " and " + list.get(i);
      }else {
        result += ", " + list.get(i);
      }

    }
    return result;

  }

  static String pluralize (String word, int n){
    if (n == 1){
      return n + word;
    }else {
      return n + word + "s";
    }
  }
}
