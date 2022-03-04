class pattern4 {
    // butterfly pattern
    // *      *
    // **    **
    // ***  ***
    // ********
    // ********
    // ***  ***
    // **    **
    // *      *
    public static void main(String[] args) {
        int n = 4;
        // upper half
        for(int i= 1; i <= n; i++) {
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            //spaces
            for(int j = 1; j <= 2*(n-i); j++ ) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i= n; i >= 1; i--) {
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            //spaces
            for(int j = 1; j <= 2*(n-i); j++ ) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
