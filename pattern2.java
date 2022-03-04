import java.util.Scanner;
// patter to be printed
// *       *
// **     **
// ***   *** 
// **** ****
// *********

public class pattern2 {
    public static void main(String[] args) {
        int st = 1; 
        int sp = 7;
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int l = 0; l < st; l++) {
                System.out.print("*");
            }
            for(int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < st; k++) {
                if(i == n-1 && k == n-1) {
                    break;
                }
                System.out.print("*");
            }
            st++;
            sp-=2;
            System.out.println();
            
        }

    }
}