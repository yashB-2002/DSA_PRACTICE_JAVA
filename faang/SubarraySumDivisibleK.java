import java.util.HashMap;

public class SubarraySumDivisibleK {
    public static void main(String[] args) {
        
    }
    public static int solution(int[] a, int k ) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans= 0,len=Integer.MIN_VALUE;
        m.put(0,-1);
        int sum = 0, rem = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
            rem = sum % k;
            if(rem < 0) 
            {
                rem += k;
            }
            if(m.containsKey(rem)) {
                ans = i - m.get(rem);
                if(ans > len) len = ans;
            }
            else{
                m.put(rem,i);
            }
        }
        return len;
    }
}
