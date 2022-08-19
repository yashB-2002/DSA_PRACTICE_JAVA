public class secondMax {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 2, 5 };
    System.out.println(secondLargestElement(arr));
  }

  public static int secondLargestElement(int[] arr) {
    int max = getMax(arr);
    int smax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != max) {
        if (arr[i] > smax) {
          smax = arr[i];
        }
      }

    }
    return smax;
  }

  public static int getMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
