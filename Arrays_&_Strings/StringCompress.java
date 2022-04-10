public class StringCompress {
    public static void main(String[] args) {
        char[] arr = { 'a', 'a','a','d','d', 'b', 'b','c','c','c'};
        int ans = compress(arr);
        System.out.println(ans);
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        int newIdx = 0, i = 0;
        while (i < n)
        {
            int j = i + 1;
            while (j < n && chars[j] == chars[i])
                j++;
            chars[newIdx++] = chars[i];
            int count = j - i;
            if (count > 1) {
                String count1 = Integer.toString(count);
                for (char c : count1.toCharArray()) {
                    chars[newIdx++] = c;
                }
            }
            i = j;
        }
        return newIdx;
    }
}