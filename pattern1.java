import java.util.Scanner;
// X pattern printing
public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int j = n-i-1;
            for(int k = 0; k < n; k++) {
                if(k == i || k == j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}