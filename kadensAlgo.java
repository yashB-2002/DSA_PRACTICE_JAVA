class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum < 0) {
                currSum = 0;
            }
            if(currSum > maxSum ) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}