import java.util.Arrays;
import java.util.*;
public class twoSum {
    
    // Given an array of integers nums and an integer target, 
    // return indices of the two numbers such that they add up to target.
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum1(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i], i++))
            if (map.containsKey(target - nums[i]))
                return new int[] { map.get(target - nums[i]), i };
        return new int[] { 0, 0 };
    }
}