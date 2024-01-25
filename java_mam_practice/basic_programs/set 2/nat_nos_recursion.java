// Sum of Natural Numbers using recursion

import java.util.*;

class numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = calculatenatural(num);
        System.out.println(sum);
    }
    public static int calculatenatural(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + calculatenatural(n-1);
        }
    }
}