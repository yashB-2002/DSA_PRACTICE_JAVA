import java.util.Scanner;

class KCON {
  public static void main(String[] args) throws java.lang.Exception {
    try (// your code goes here
        Scanner s = new Scanner(System.in)) {
      int t = s.nextInt();
      while (t-- > 0) {
        int n = s.nextInt(), k = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
          a[i] = s.nextInt();
        }
        int[] b = new int[n * k];
        int idx = 0;
        while (k-- > 0) {
          for (int i = 0; i < n; i++) {
            b[idx++] = a[i];
          }
        }
        System.out.println(kadane(b, b.length));
      }
    }
  }

  public static int kadane(int[] arr, int n) {
    int cs = 0, ms = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      cs += arr[i];
      if (cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    return ms;
  }
}