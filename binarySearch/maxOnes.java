public class maxOnes {
  public static void main(String[] args) {
    int[][] arr = { { 0, 0, 1, 1 }, { 0, 0, 0, 1 }, { 0, 1, 1, 1 } };
    System.out.println(countOnes(arr));
  }

  // TIME COMPLEXITY - O(n*logn)
  public static int countOnes(int[][] mat) {
    int max = -1, rowNo = -1;
    for (int i = 0; i < mat.length; i++) {
      int countOfOnesInIthRow = binarySearch(mat, i);
      if (max < countOfOnesInIthRow) {
        max = countOfOnesInIthRow;
        rowNo = i;
      }
    }
    return rowNo;
  }

  private static int binarySearch(int[][] mat, int i) {
    int s = 0, e = mat[0].length - 1, fisrtIdx = mat[0].length;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (mat[i][m] == 1) {
        fisrtIdx = m;
        e = m - 1;
      } else {
        s = m + 1;
      }
    }
    int count = mat[0].length - fisrtIdx;
    return count;

  }
}
