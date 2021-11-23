package TheLift;

import java.util.ArrayList;
import java.util.Collections;

public class Dinglemouse {

  public static int[] theLift(final int[][] queues, final int capacity) {

    ArrayList<Integer> floors = new ArrayList<>();
    boolean direction = true;
    int floor = 0;
    floors.add(floor);
    ArrayList<Integer> lift = new ArrayList<>();

    while (!isEmpty(queues) || !lift.isEmpty()) {
      if (direction && floor == queues.length - 1)
        direction = false;
      else if (!direction && floor == 0)
        direction = true;

      if (lift.contains(floor)) {
        floors.add(floor);
        lift.removeAll(new ArrayList<>(Collections.singletonList(floor)));
      }

      ArrayList<Integer> newFloor = new ArrayList<>();
      for (int i = 0; i < queues[floor].length; i++) {
        int target = queues[floor][i];
        if (floors.get(floors.size() - 1) != floor && (target > floor) == direction)
          floors.add(floor);
        if (lift.size() < capacity && (target > floor) == direction)
          lift.add(target);
        else
          newFloor.add(target);
      }
      queues[floor] = newFloor.stream().mapToInt(i -> i).toArray();

      floor = (direction) ? floor + 1 : floor - 1;
    }

    floor = 0;
    if (floors.get(floors.size() - 1) != floor)
      floors.add(floor);

    return floors.stream().mapToInt(i -> i).toArray();
  }

  private static boolean isEmpty(int[][] queues) {
    for (int[] queue : queues)
      if (queue.length != 0)
        return false;
    return true;
  }
}