public class inverseNum {
    public static void main(String[] args) {
        int n = 126354;
        int inv = 0;
        int op = 1;
        while(n != 0) {
            int od = n % 10;
            int ip = od;
            int id = op;
            inv = inv + id * (int)Math.pow(10,ip-1);
            n /= 10;
            op++;
        }
        System.out.println(inv);
    }
}