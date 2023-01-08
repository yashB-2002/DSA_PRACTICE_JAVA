import java.util.HashMap;
import java.util.PriorityQueue;

class ReorganizeStrings {
    public static void main(String[] args) {
        System.out.println(func("aab"));
    }
    public static String func(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++) 
        {
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((x,y)->m.get(y)-m.get(x)); // maxheap
        pq.addAll(m.keySet());
        StringBuilder sb = new StringBuilder();
        while(pq.size()>1){
            char c1 = pq.remove(); // char which occured most no of times
            char c2 = pq.remove(); // char which occured second most no of times
            sb.append(c1);
            sb.append(c2);
            m.put(c1, m.get(c1)-1);
            m.put(c2, m.get(c2)-1);
            if(m.get(c1) > 0) {
                pq.add(c1);
            }
            if(m.get(c2) > 0) {
                pq.add(c2);
            }
        }
        if(pq.size()==1 ) {
            char c3 = pq.remove();
            int freq = m.get(c3);
            if(freq > 1) {
                return "";
            }
            else {
                sb.append(c3);
            }
        }
        return sb.toString();
    }
}