import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();
        for(int i = low; i <= high; i++ ) {
            int count = 0;
            for(int div = 2; div * div <= i; div++ ) {
                if(i % div  == 0 ) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.println( i + " is Prime");
            }
            else {
                System.out.println(i + " is not Prime");
            }
        }
    }
}