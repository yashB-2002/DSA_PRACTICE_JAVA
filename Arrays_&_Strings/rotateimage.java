
public class rotateimage {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 4 }, { 3, 5, 6 }, { 2, 3, 6 } };
    // rotateCw(arr);
    rotateAcw(arr);
    display(arr);
  }

  public static void display(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

  // cw rotation code
  public static void rotateCw(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      // transpose
      for (int j = 0; j <= i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // reverse every single column for acw rotation
    // for cw reverse every row
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < (matrix.length / 2); j++) {
        int temp2 = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length - 1 - j];
        matrix[i][matrix.length - 1 - j] = temp2;
      }
    }
  }
  // i/p = 1 2 4
  // 3 5 6
  // 2 3 6
  // o/p
  // 2 3 1
  // 3 5 2
  // 6 6 4

  // acw code
  public static void rotateAcw(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      // transpose
      for (int j = 0; j <= i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // reverse every single column for acw rotation
    // for cw reverse every row
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < (matrix.length / 2); j++) {
        int temp2 = matrix[j][i];
        matrix[j][i] = matrix[matrix.length - 1 - j][i];
        matrix[matrix.length - 1 - j][i] = temp2;
      }
    }
  }
  // i/p = 1 2 4
  // 3 5 6
  // 2 3 6
  // o/p
  // 4 6 6
  // 2 5 3
  // 1 3 2
}
