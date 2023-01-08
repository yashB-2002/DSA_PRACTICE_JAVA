import java.util.PriorityQueue;

public class KClosestToOrigin {
    public static void main(String[] args) {
        
    }
    public static int[][] find(int[][] pts,int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for(int[] pt : pts) {
            maxHeap.add(pt);
            if(maxHeap.size() > 1) {
                maxHeap.remove();
            }
        }
        int[][] ans = new int[k][2];
        while(k-->0) {
            ans[k] = maxHeap.remove();
        }
        return ans;
    }
}
