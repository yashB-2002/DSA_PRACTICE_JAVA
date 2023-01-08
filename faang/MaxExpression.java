import java.util.Scanner;

public class MaxExpression {
    public static void main (String args[]) {
        Scanner ss= new Scanner(System.in);
        int n = ss.nextInt();
        int[] p = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = ss.nextInt();
            c[i] = ss.nextInt();
        }
        System.out.println(ans(p,c));
        ss.close();
    }

    private static int ans(int[] a, int[] b) {
        int n = a.length;
        int a1=Integer.MIN_VALUE,a2=Integer.MAX_VALUE;
        int b1=Integer.MIN_VALUE,b2=Integer.MAX_VALUE;
        int c1=Integer.MIN_VALUE,c2=Integer.MAX_VALUE;
        int d1=Integer.MIN_VALUE,d2=Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        if(a1<a[i]+b[i]+i) a1= a[i]+b[i]+i;
        if(a2>a[i]+b[i]+i) a2 = a[i]+b[i]+i;
        if(b1<b[i]-a[i]+i) b1=b[i]-a[i]+i;
        if(b2>b[i]-a[i]+i) b2 =b[i]-a[i]+i;
        if(c1<b[i]+a[i]-i) c1 = b[i]+a[i]-i;
        if(c2>b[i]+a[i]-i) c2 = b[i]+a[i]-i;
        if(d1<b[i]-a[i]-i) d1 =b[i]-a[i]-i;
        if(d2>b[i]-a[i]-i) d2 = b[i]-a[i]-i;
        }
        int case1= a1-a2>b1-b2?a1-a2:b1-b2;
        int case2= c1-c2>d1-d2?c1-c2:d1-d2;
        return case1>case2?case1:case2;
    }
}
