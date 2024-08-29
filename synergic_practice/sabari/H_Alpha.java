package sabari;
// ! from the given string, add the numbers in the string, if the sum is 7 print true else false.

import java.util.*;

public class H_Alpha {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String str=sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum+=Integer.parseInt(str.charAt(i)+"");
			}
		}
		System.out.println((sum==7)?"True":"False");
	}
}