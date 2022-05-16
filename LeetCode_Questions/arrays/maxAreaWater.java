// container with most water
public class maxAreaWater {
  public static void main(String[] args) {
    int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(arr));
  }

  // o(n)
  public static int maxArea(int[] height) {
    int maxWater = 0;
    int i = 0, j = height.length - 1;
    while (i < j) {
      int wt = j - i, ht = Math.min(height[i], height[j]);
      int area = wt * ht;
      maxWater = Math.max(maxWater, area);
      if (height[i] < height[j])
        i++;
      else
        j--;
    }
    return maxWater;
  }
}