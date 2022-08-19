class maxAndMin {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    System.out.println(findSum(a, a.length));
  }

  // no of comparison in this approach is = 1 + (n-2)*2
  public static int findSum(int A[], int N) {
    // code here
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    if (N == 1) {
      max = A[0];
      min = A[0];
      return max + min;
    } else {
      if (A[0] > A[1]) {
        max = A[0];
        min = A[1];
      } else {
        max = A[1];
        min = A[0];
        for (int i = 2; i < N; i++) {
          if (A[i] > max) {
            max = A[i];
          }
          if (A[i] < min) {
            min = A[i];
          }
        }
      }
    }
    return max + min;
  }

  // approach 2 with comparison = in odd N case => 3*(n-1)/2, even => 1 +
  // 3*(n-1)/2
  public static int findSum2(int A[], int N) {
    // code here
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, i = 0;
    if (N % 2 != 0) {
      max = A[0];
      min = A[0];
      i = 1;
    } else {
      if (A[0] > A[1]) {
        max = A[0];
        min = A[1];
      } else {
        max = A[1];
        min = A[0];

      }
      i = 2;
    }
    while (i < N - 1) { // n-1 comparison for this loop
      if (A[i] > A[i + 1]) { // 1 comparison
        if (A[i] > max) { // another 1
          max = A[i];
        }
        if (A[i + 1] < min) { // another 1
          min = A[i + 1];
        }
      } else {
        if (A[i + 1] > max) {
          max = A[i + 1];
        }
        if (A[i] < min) {
          min = A[i];
        }
      }
      i += 2;
    }
    return max + min;

  }
}