import java.util.*;

public class threeSum {
    
    // Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
    // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    // Notice that the solution set must not contain duplicate triplets.

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum1(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums.length == 0)
            return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == -nums[i]) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > -nums[i])
                    k--;
                else if (sum < -nums[i])
                    j++;
            }

        }
        return new ArrayList<>(res);
    }
}