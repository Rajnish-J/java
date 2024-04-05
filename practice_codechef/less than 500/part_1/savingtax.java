// In Chefland, everyone who earns strictly more than Y rupees per year, has to pay a tax to Chef. 
// Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.

// You have earned (X>Y) rupees this year. 
// Find the minimum amount of money you have to invest so that you don't have to pay taxes this year.

import java.util.*;

class tax{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int salary = sc.nextInt();
		    int tax = sc.nextInt();
		    int pay;
		    if(salary>tax){
		        pay = salary - tax;
		        System.out.println(pay);
		    }
		}
    }
}