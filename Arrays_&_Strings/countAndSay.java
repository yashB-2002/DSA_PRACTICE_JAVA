import java.util.*;

public class countAndSay {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(countAndSay1(n));
    }

    public static String countAndSay1(int n) {
        String val = "1";
        for (int i = 0; i < n - 1; i++) {
            StringBuilder res = new StringBuilder();
            int c = 1;
            char ch = val.charAt(0);
            for (int j = 1; j < val.length(); j++) {
                if (ch != val.charAt(j)) {
                    res.append(c).append(ch);
                    ch = val.charAt(j);
                    c = 0;
                }
                c++;
            }
            res.append(c).append(ch);
            val = res.toString();
        }
        return val;
    }
}
