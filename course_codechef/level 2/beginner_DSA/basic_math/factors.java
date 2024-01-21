//We have covered various modules so far - Basic math, Logic building and Array operations.
//These will be helpful in our current module.

//Let us start with a simple problem.
//You are given an integer N.
//You need to create and output to the console all the divisors of this integer in an ascending order, 
//each separated by a space.

import java.util.*;
class factor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] num;

            for(int i=1; i<=n;i++){
                if(n%i == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
        }
    }
}