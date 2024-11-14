import java.util.ArrayList;
import java.util.List;

public class Subsets {

  public static List<List<Integer>> subsets(List<Integer> set) {
    List<List<Integer>> subsets = new ArrayList<>();
    for (int i = 0; i < (1 << set.size()); i++) {
      List<Integer> subset = new ArrayList<>();
      for (int j = 0; j < set.size(); j++) {
        if ((i & (1 << j)) > 0) {
          subset.add(set.get(j));
        }
      }
      subsets.add(subset);
    }
    return subsets;
  }

  public static void main(String[] args) {
    List<Integer> set = new ArrayList<>();
    set.add(1);
    set.add(2);
    set.add(3);

    List<List<Integer>> subsets = subsets(set);

    for (List<Integer> subset : subsets) {
      System.out.println(subset);
    }
  }
}