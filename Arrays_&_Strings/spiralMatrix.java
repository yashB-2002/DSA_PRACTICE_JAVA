import java.util.*;

public class spiralMatrix {
  public static void main(String[] args) {

  }

  public List<Integer> spiralOrder(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    List<Integer> list = new ArrayList<>();
    if (row == 0) {
      return list;
    }
    int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;
    while (l <= r && t <= b) {
      if (d == 0) {
        for (int i = l; i <= r; i++) {
          list.add(matrix[t][i]);
        }
        t++;
        d = 1;
      } else if (d == 1) {
        for (int i = t; i <= b; i++) {
          list.add(matrix[i][r]);
        }
        r--;
        d = 2;
      } else if (d == 2) {
        for (int i = r; i >= l; i--) {
          list.add(matrix[b][i]);
        }
        b--;
        d = 3;
      } else {
        for (int i = b; i >= t; i--) {
          list.add(matrix[i][l]);
        }
        l++;
        d = 0;
      }
    }
    return list;
  }
}