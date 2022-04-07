import java.util.*;

public class fourSum {
    // Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] 
    // such that : a,b,c,and d are distinct , nums[a]+nums[b]+nums[c]+nums[d]==target
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        List<List<Integer>> ans = fourSum1(nums,target);
        System.out.println(ans);
    }
    
    public static List<List<Integer>> fourSum1(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = j + 1, l = nums.length - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        if (!ans.contains(list))
                            ans.add(list);
                        k++;
                    } else if (sum < target)
                        k++;
                    else
                        l--;

                }
            }
        }
        return ans;

    }


}