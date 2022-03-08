import java.util.*;
public class digits {
    public static void main(String[] args) {
        int n = 12365;
        int count = noOfDigits(n);
        // System.out.println(count);
        int div = (int) Math.pow(10,count-1);
        while(div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div /= 10;
        }
    }
    public static int noOfDigits(int num ) {
        int c = 0;
        while(num != 0) {
            num /= 10;
            c++;
        }
        return c;
    }
}