package sabari;
// ! adding domain name (string) with the second string

import java.util.Scanner;

public class OfflineAssign {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.next();
		String domain = sc.next();
		String res = name.concat("@").concat(domain).concat(".").concat("com");
		System.out.println("After concat :" + res);
	}
}