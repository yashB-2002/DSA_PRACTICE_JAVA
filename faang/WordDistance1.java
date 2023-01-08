import java.util.*;
public class WordDistance1 {
//     Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list
// Note : You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
// ! 5
// ! practice  makes  perfect  coding makes     -> two words are = coding, practice
// ! output is 3
public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] arr = new String[n];
    for(int i = 0; i < n; i++) {
        arr[i] = s.next();
    }
    String s1 = s.next();
    String s2 = s.next();
    System.out.println(ans(arr,s1,s2));
    s.close();
}
public static int ans(String[] a, String a1, String b1) {
    int w1 = -1, w2 = -1, ans = a.length;
    for(int i = 0; i < a.length; i++) {
        if(a[i].equals(a1)) w1 = i;
        if(a[i].equals(b1)) w2 = i;
        if(w1 != -1 && w2 != -1) ans = Math.min(ans,Math.abs(w1-w2));
    }
    return ans;
}
}
