import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramsTogether {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.next();
        }
        ArrayList<ArrayList<String>> ans = getAnagrams(a);
        for(ArrayList<String> l : ans) {
            for(String ss : l) {
                System.out.print(ss+" ");
            }
            System.out.println();
        }
        s.close();
    }
    public static ArrayList<ArrayList<String>> getAnagrams(String[] s) {
        HashMap<String,ArrayList<String>> m = new HashMap<>();
        for(String w : s) {
            String w1= sort(w);
            if(m.containsKey(w1)) {
                ArrayList<String> al = m.get(w1);
                al.add(w);
                m.put(w1,al);
            }
            else{
                ArrayList<String> al2 = new ArrayList<>();
                al2.add(w);
                m.put(w1,al2);
            }
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for(String str : m.keySet()) {
            ans.add(m.get(str));
        }
        return ans;
    }
    public static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
