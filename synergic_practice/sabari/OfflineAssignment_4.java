package sabari;
// ! String operations

import java.util.Scanner;

public class OfflineAssignment_4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(sc.next());
		if (str.length() % 2 == 0) {
			System.out.println("length is even so output :" + str);
		} else {
			System.out.println("length is odd so output :" + str.reverse());
		}
	}
}
