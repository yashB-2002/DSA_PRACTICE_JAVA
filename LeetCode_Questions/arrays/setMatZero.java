import java.util.ArrayList;

public class setMatZero {
  public void setZeroes(int[][] matrix) {
    ArrayList<Integer> rowList = new ArrayList<>();
    ArrayList<Integer> colList = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          rowList.add(i);
          colList.add(j);
        }
      }
    }

    for (int rowIndex : rowList) {
      makeRowZero(matrix, rowIndex);
    }

    for (int colIndex : colList) {
      makeColZero(matrix, colIndex);
    }

    return;
  }

  public void makeRowZero(int[][] matrix, int rIdx) {
    for (int j = 0; j < matrix[0].length; j++) {
      matrix[rIdx][j] = 0;
    }
  }

  public void makeColZero(int[][] matrix, int cIdx) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][cIdx] = 0;
    }
  }
}