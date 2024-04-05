// You are given 2 integers - A and C.
// You need to find if there exists any integer B which meets the following condition B must be an integer B is the average of A and C.
// For each test case, output B. If no such integer exists, output "-1"

import java.util.*;

class average{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            
            int a = sc.nextInt();
            int c = sc.nextInt();
            int b = (a + c) / 2;
            
            if((a+c) % 2 == 0){
            System.out.println(b);
            }else{
                System.out.println("-1");
            }
        }
    }
}