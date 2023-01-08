import java.util.*;

public class KFreqWord {
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"i","did","i","i","did","did","you"}, 2));
    }

    public static ArrayList<String> solve(String[] words, int k) {
        ArrayList<String> l = new ArrayList<>();
        HashMap<String, Integer> m = new HashMap<>();
        for(String s : words) {
            m.put(s, m.getOrDefault(s, 0)+1);
        }
        PriorityQueue<String> arr[] = new PriorityQueue[words.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new PriorityQueue<>();
        }
        // ! putting words at index in array 
        for(String w: m.keySet()) {
            arr[m.get(w)-1].add(w);
        }
        // ! getting of k words
        for(int i = arr.length-1; i>= 0 && k > 0 ; i--) {
            while(k > 0 && !arr[i].isEmpty()) {
                l.add(arr[i].remove());
                k--;
            }
        }
        return l;
    }

}
