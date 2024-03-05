/*
Reach fast
Chef is standing at coordinate A while Chefina is standing at coordinate B.

In one step, Chef can increase or decrease his coordinate by at most K.

Determine the minimum number of steps required by Chef to reach Chefina.
 */

 import java.util.*;

 class fast{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0){
             int chef=sc.nextInt();
             int chefina=sc.nextInt();
             int size=sc.nextInt();
             int check=Math.abs(chef-chefina);
             if(check%size==0)
             {
                 System.out.println(check/size);
             }
             else if(check%size!=0)
             {
                 System.out.println((check/size)+1);
             }
         }
     }
 }