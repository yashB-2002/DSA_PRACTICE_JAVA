
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class relativeSort {
  public static void main(String[] args) {
    int[] a1 = { 28, 6, 22, 8, 44, 17 };
    int[] a2 = { 22, 28, 8, 6 };
    int[] ans = relativeSortArray(a1, a2);
    System.out.println(ans);
  }

  public static int[] relativeSortArray(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> map = new HashMap();
    ArrayList<Integer> list = new ArrayList();
    for (int num : arr2) {
      map.put(num, 0);
    }
    for (int num : arr1) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        list.add(num);
      }
    }
    int i = 0;
    for (int num : arr2) {
      while (map.get(num) > 0) {
        arr1[i++] = num;
        map.put(num, map.get(num) - 1);
      }
    }
    int[] arr = new int[list.size()];
    int j = 0;
    for (int elem : list) {
      arr[j++] = elem;
    }
    Arrays.sort(arr);
    for (int e : arr) {
      arr1[i++] = e;
    }
    return arr1;
  }
}