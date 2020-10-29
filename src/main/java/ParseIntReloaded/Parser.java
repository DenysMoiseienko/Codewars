package ParseIntReloaded;

import java.util.*;

public class Parser {

  public static int parseInt(String numStr) {

    Map<String, Integer> keyWords = new LinkedHashMap<>();
    keyWords.put("zero", 0);
    keyWords.put("one", 1);
    keyWords.put("two", 2);
    keyWords.put("three", 3);
    keyWords.put("four", 4);
    keyWords.put("five", 5);
    keyWords.put("six", 6);
    keyWords.put("seven", 7);
    keyWords.put("eight", 8);
    keyWords.put("nine", 9);
    keyWords.put("ten", 10);
    keyWords.put("eleven", 11);
    keyWords.put("twelve", 12);
    keyWords.put("thirteen", 13);
    keyWords.put("fourteen", 14);
    keyWords.put("fifteen", 15);
    keyWords.put("sixteen", 16);
    keyWords.put("seventeen", 17);
    keyWords.put("eighteen", 18);
    keyWords.put("nineteen", 19);
    keyWords.put("twenty", 20);
    keyWords.put("thirty", 30);
    keyWords.put("forty", 40);
    keyWords.put("fifty", 50);
    keyWords.put("sixty", 60);
    keyWords.put("seventy", 70);
    keyWords.put("eighty", 80);
    keyWords.put("ninety", 90);
    keyWords.put("hundred", 100);
    keyWords.put("thousand", 1000);

    Map<String, Integer> multi = new LinkedHashMap<>();
    multi.put("hundred", 100);
    multi.put("thousand", 1000);
    multi.put("million", 1000000);

    numStr = numStr.replace(" and", "");
    int result = 0;
    int multiplier = 1;
    String[] arr = numStr.split(" ");
    Collections.reverse(Arrays.asList(arr));

    for (int i = 0; i < arr.length; i++) {
      if (multi.get(arr[i]) != null) {
        if (multi.get(arr[i]) == 100) {
          multiplier *= multi.get(arr[i]);
        } else {
          multiplier = multi.get(arr[i]);
        }
      } else {
        if (!arr[i].contains("-")) {
          result += keyWords.get(arr[i]) * multiplier;
        } else {
          String[] num = arr[i].split("-");
          result += (keyWords.get(num[0]) + keyWords.get(num[1])) * multiplier;
        }
      }
    }
    return result;
  }
}

