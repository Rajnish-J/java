import java.util.*;

class fac_rec {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int mul = fact(n - 1);
        return mul*n;
    }
}