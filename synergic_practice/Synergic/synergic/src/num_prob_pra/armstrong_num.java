package num_prob_pra;

import java.util.*;

public class armstrong_num {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the number to check Armstrong: ");
		int num = sc.nextInt();
		int check = 0, org_num = num;
		if(num <= 0 ) {
			System.out.println("Enter the postive and no-zero number..");
		}
		else {
			int size = find_length(num);
			while(org_num > 0) {
				int temp = org_num%10;
				check += Math.pow(temp, size);
				org_num /= 10;
			}
			
			System.out.println((check == num) ? "Armstrong number" : "Not an armstrong number");
		}
		
	}
	
	public static int find_length(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	

}
