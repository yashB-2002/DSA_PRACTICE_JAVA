import java.util.*;

public class baseballGame {
    public static void main(String[] args) {
        String[] arr = { "5", "2", "C", "D", "+"};
        int ans = calPoints(arr);
        System.out.println(ans);
    }

    public static int calPoints(String[] ops) {
        if (ops.length == 0)
            return 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("D"))
                st.push(2 * st.peek());

            else if (ops[i].equals("C"))
                st.pop();

            else if (ops[i].equals("+")) {
                int sum = 0;
                int s1 = st.pop();
                sum = s1 + st.peek();
                st.push(s1);
                st.push(sum);
            } else
                st.push(Integer.parseInt(ops[i]));

        }
        int totalSum = 0;
        while (!st.isEmpty()) {
            totalSum += st.pop();
        }
        return totalSum;
    }
}