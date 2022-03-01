
// n = 6
// output -> 1 3 5 6 4 2

class Solution {
    public static void arrange(int[] arr, int n) {
        int s = 0;
        int e=arr.length-1;
        int val=1;
        while(s<e){
            arr[s]=val;
            val++;
            arr[e]=val;
            val++;
            s++;
            e--;
            if(s==e){
                arr[s]=val;   
            }
        }
    }
}
