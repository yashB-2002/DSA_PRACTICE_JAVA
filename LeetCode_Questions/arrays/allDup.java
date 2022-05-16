import java.util.*;

// return elements that appear in array twice.
public class allDup {
  public static void main(String[] args) {
    int[] arr = { 5, 6, 5, 8, 6, 7, 7, 8, 2, 1 };
    List<Integer> ans = findDuplicates1(arr);
    System.out.println(ans.toString());
  }

  // brute force
  public static List<Integer> findDuplicates1(int[] arr) {
    List<Integer> al = new ArrayList<>();
    int n = arr.length;
    for (int i = 0; i < n; i++)
      for (int j = i + 1; j < n; j++)
        if (arr[i] == arr[j])
          al.add(arr[i]);
    return al;
  }

  // hashmap approach
  public static List<Integer> findDuplicates2(int[] arr) {
    List<Integer> al = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();
    int n = arr.length;

    for (int i = 0; i < n; i++)
      if (hm.containsKey(arr[i]))
        hm.put(arr[i], hm.get(arr[i]) + 1);
      else
        hm.put(arr[i], 1);

    for (int key : hm.keySet())
      if (hm.get(key) == 2)
        al.add(key);

    return al;
  }

  // hashset approach
  public static List<Integer> findDuplicates3(int[] arr) {
    List<Integer> al = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
    int n = arr.length;

    for (int i = 0; i < n; i++)
      if (hs.contains(arr[i]))
        al.add(arr[i]);
      else
        hs.add(arr[i]);

    return al;
  }

  // sorting approach
  public static List<Integer> findDuplicates4(int[] arr) {
    List<Integer> al = new ArrayList<>();
    Arrays.sort(arr);
    int n = arr.length;

    for (int i = 0; i < n - 1; i++)
      if (arr[i] == arr[i + 1]) {
        al.add(arr[i]);
        i++;
      }

    return al;
  }

  // correct index approach
  public static List<Integer> findDuplicates(int[] arr) {
    List<Integer> al = new ArrayList<>();
    int n = arr.length;
    boolean[] visited = new boolean[n];

    for (int i = 0; i < n; i++) {
      int ele = arr[i];
      int idx = ele - 1;
      if (visited[idx] == true)
        al.add(ele);

      visited[idx] = true;
    }

    return al;
  }
}