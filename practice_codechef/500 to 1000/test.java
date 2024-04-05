/*
Primality Test
Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. 
The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. 
Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.

Note that 1 is not a prime number.
 */

import java.util.*;

class test{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int flag = 0;
            if(num % 2 == 0 || num == 1){
                System.out.println("No");
            }
            else if(num == 2){
                System.out.println("Yes");
            }
            else{
                for(int i = 2; i * i<num; i++){
                    if (num%1 == 0) {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}