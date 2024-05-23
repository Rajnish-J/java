/*
Building Race

Two friends Chef and Chefina are currently on floors A and B respectively. 
They hear an announcement that prizes are being distributed on the ground floor and so decide to reach the ground floor as soon as possible.

Chef can climb down X floors per minute while Chefina can climb down Y floors per minute. 
Determine who will reach the ground floor first (ie. floor number 0). In case both reach the ground floor together, print Both.
 */

 import java.util.*;

 class chef_chefina_floor{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0){
             int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
             double chef = (double)a/x, chefina = (double)b/y;
             System.out.println(chef>chefina ? "chefina" : (chefina > chef) ? "chef" : "both");
         }
     }
 }