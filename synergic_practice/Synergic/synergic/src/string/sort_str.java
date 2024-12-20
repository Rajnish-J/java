package string;

import java.util.*;

import array.sort;

public class sort_str {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		String str = sc.nextLine().trim().replace(" " , "");
		
		System.out.println(approach_1(str));
		System.out.println(approach_2(str));
		
	}
	
	public static String approach_1(String str) {
		String res = "";
		
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					char ch = arr[i];
					arr[i] = arr[j];
					arr[j] = ch;
				}
			}
		}
		
		for(char obj : arr) {
			res += obj;
		}
		return res;
	}
	
	public static String approach_2(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		str = "";
		for(char obj : ch) {
			str += obj;
		}
		return str;
	}
}
