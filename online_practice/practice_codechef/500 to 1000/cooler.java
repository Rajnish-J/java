/*
The Cooler Dilemma 2
The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

Rent a cooler at the cost of X coins per month.
Purchase a cooler for Y coins.
Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.
 */

import java.util.*;

class cooler{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            long month = sc.nextLong();
            long year = sc.nextLong();

            if(year % month != 0){
                System.out.println(year / month);
            }
            else{
                System.out.println((year / month) - 1);
            }
        }
    }
}