public class pattern8 {
    // arrow pattern
//     *
//     **
//   *****
//     **
//     *
    public static void main(String[] args) {
        int n  = 5;
        int st = 1, sp =  n/2;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp ;j++) {
                if(i == n/2+1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
                // System.out.print(" ");
            }
            for(int k = 1; k <= st; k++) {
                System.out.print("*");
            }
            if(i <= n/2) {
                st++;
            }
            else {
                st--;
            }
            System.out.println();
        }
    }
}