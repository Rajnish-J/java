import java.lang.*;
class gcd {
    public static void main(String[] args) {
        int num_1 = 24;
        int num_2 = 36;
        int min = Math.min(num_1, num_2);
        int gcd = 1;

        for(int i = min; i>=1; i--){
            if((num_1 % i == 0) && (num_2 % i == 0)){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
