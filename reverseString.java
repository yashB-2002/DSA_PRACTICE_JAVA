import java.util.*;
class reverseString
{
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseWord(s));
    }
    public static String reverseWord(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++  ) {
            s.push(str.charAt(i));
        }
        String st = "";
        while(!s.isEmpty()) {
            st += s.peek();
            s.pop();
        }
        return st;
    }
}