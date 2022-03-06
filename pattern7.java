public class pattern7 {
    // pattern to be printed
// 1     1
// 12   21
// 123 321
// 1234321
    public static void main(String[] args) {
        int n = 4;
        int st = 1;
        int sp = 2*n-3;
        for(int i = 1; i <= n; i++) {
            int val = 1;
            for(int j = 1; j <= st; j++) {
                System.out.print(val++);
            }
            for(int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            if(i == n) {
                st--;
                val--;
            }
            for(int j = 1; j <= st; j++) {
                val--;
                System.out.print(val);
            }
            st++;sp-=2;
            System.out.println();
            
        }
    }
}