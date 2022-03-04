class pattern6 {
    // diamond patttern
//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        int n = 4;
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            //spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}