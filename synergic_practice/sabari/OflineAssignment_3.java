package sabari;
import java.util.Scanner;

public class OflineAssignment_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				result.append(str.charAt(i));
			}
		}
		System.out.println("Result String :" + result);
	}
}
