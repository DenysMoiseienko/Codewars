package SortBinaryTreeByLevels;

import java.util.*;

public class Kata {

  public static List<Integer> treeByLevels(Node node) {
    if (node == null) {
      return new ArrayList<>();
    }

    List<Integer> result = new ArrayList<>();

    SimpleQueue<Node> queue = new SimpleQueue<>();
    queue.add(node);

    while (!queue.isEmpty()){
      Node temp = queue.remove();

      result.add(temp.value);

      if (temp.left != null){
        queue.add(temp.left);
      }
      if (temp.right != null){
        queue.add(temp.right);
      }
    }
    return result;
  }
}

class SimpleQueue<T> {

  private ArrayList<T> list = new ArrayList<>();

  public void add(T item) {
    list.add(item);
  }

  public T remove() {
    return list.remove(0);
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

}

