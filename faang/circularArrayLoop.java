public class circularArrayLoop {
    public static void main(String[] args) {
        System.out.println(circularArrayLoop1(new int[]{-2,-3,-9}));
    }
//  ?   You are given an array of positive and negative integers. If a number k at 
// ? an index is positive, then move forward k steps. Conversely,
// ?  if it's negative (-k), move backward k steps. Since the array 
// ? is circular, you may assume that the last element's next element is the first eleme
// ? nt, and the first element's previous element is the last element.
//? Determine if there is a loop (or a cycle) in array. A cycle must start and end 
// ?at the same index and the cycle's length > 1. Furthermore, movements in a cycle 
// ?must all follow a single direction. In other words, a cycle must not consist of both forward and backward movements.
// ? Print 1 if cycle present else print 0.



// ! this include concept of slow and fast ptr if they meet at some point then their is cycle or loop present in array.
// ! cycle must follow only single direction 
    public static int circularArrayLoop1(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) 
        {
            int s = i,f=i;
            if(nums[i] == 0) continue;
            while((nums[s]*nums[getNextPosition(nums, s)] > 0) &&
            (nums[f]*nums[getNextPosition(nums, f)] > 0)  &&
            (nums[f]*nums[getNextPosition(nums, getNextPosition(nums, f))] > 0) 
            ){
                s= getNextPosition(nums, s);
                f=getNextPosition(nums, getNextPosition(nums, f));
                if(s == f) {
                    // ! cycle is present but it's length should be > 1
                    if(s==getNextPosition(nums, s)) {
                        break; // ! length is 1 when slow ptr next is slow itself
                    }
                    return 1;
                }
            }
            // ! now comes the case when cycle is not present at ith index we need to dearch for some other idx
            // ! so what we'll do is we mark all the idx with 0 which gives is product when multiplied together > 0
            // ! so we are eliminating the cases which will never become the starting pt of cycle.
            s = i;
            int val = nums[s];
            while(nums[s]*val > 0) {
                int x = s;
                s =getNextPosition(nums, s);
                nums[x]=0;
            }

        }
        return 0;
    }

    public static  int getNextPosition(int[] nums, int index) {
        int nextIndex = (nums[index] + index + nums.length)%nums.length;
        return nextIndex;
    }
}
