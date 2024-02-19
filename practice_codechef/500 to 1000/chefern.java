/*
 * Chef Eren
Chef is a very big fan of Eren Yeager.
In the last season of Attack on Titan, there were N episodes numbered from 1 to N.
Each even indexed episode was A minutes long and each odd indexed episode was B minutes long.

Calculate the total duration (in minutes) of the last season.
 */

import java.util.*;

class Eren{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int season = n/2;

            if(n%2==0){
                System.out.println((season*a) + (season * b));
            }
            else{
                System.out.println((season/2)*a + ((season/2) + 1)*b);
            }
        }
    }
}
