import java.util.Scanner;

public class LCP {
    // Write a function to find the longest common prefix string amongst an array of strings.
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.next();
        }
        System.out.println(lcp(arr));
        s.close();
    }
    public static String lcp(String[] a) {
        String ans = a[0];
        for(int i = 1; i < a.length; i++) {
            String t = "";
            for(int j = 0; j < Math.min(a[i].length(),ans.length()); j++) {
                if(a[i].charAt(j) == ans.charAt(j)) t += ans.charAt(j);
                else break;
            }
            ans = t;
        }
        return ans;
    }
   
}
