public class ArrayToZigzag {
  public static void main(String[] args) {

  }

  static void zigZag(int arr[], int n) {
    // code here
    for (int i = 0; i < n - 1; i++) {
      if (i % 2 == 0 && arr[i + 1] < arr[i]) {
        swap(arr, i, i + 1);
      }
      if (i % 2 == 1 && arr[i + 1] > arr[i]) {
        swap(arr, i, i + 1);
      }
    }
  }

  static void swap(int[] arr, int a, int b) {
    int t = arr[a];
    arr[a] = arr[b];
    arr[b] = t;
  }
}
