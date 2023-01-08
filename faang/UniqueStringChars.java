class UniqueStringChars {
    public static void main(String[] args) {
        String[] arr= {"aa","ff","cd"}; // cd
        System.out.println(maxlen(arr));
    }
    public static int maxlen(String[] s) {
        String ans = "";
        return maxlenutil(s,ans,0);
    }
    public static int maxlenutil(String[] s, String ans, int i) {
        if(i == s.length) {
            int[] freq = new int[26];
            for(int k = 0; k < ans.length(); k++) {
                if(freq[ans.charAt(k)-'a'] == 1 ) return 0;
                freq[ans.charAt(k)-'a']++;
            }
            return ans.length();
        }
        int op1  = Integer.MIN_VALUE;
        int op2=op1;
        if(ans.length() + s[i].length() <= 26) {
            op1 = maxlenutil(s,ans+s[i],i+1);
        }
        op2 = maxlenutil(s,ans,i+1);
        return Math.max(op1,op2);
    }
}