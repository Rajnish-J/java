package sabari;
// ! String operations

import java.util.Scanner;

public class OfflineAssignment_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = "India Cricket Board";
		System.out.println("Second Character :" + str.charAt(2));
		String s1 = "INDIA";
		String s2 = "India";
		System.out.println("By using equal operator :" + (s1 == s2));
		System.out.println("By using Equals Method :" + s1.equals(s2));
		System.out.println("By using Ignorecase :" + s1.equalsIgnoreCase(s2));
		System.out.println("Length of str :" + str.length());
		String s3 = "Hello";
		s3 = s3.replace("e", "a");
		System.out.println("String After replace :" + s3);
		String arr[] = str.split(" ");
		System.out.println("To Print Second Word :" + arr[1]);
	}
}
