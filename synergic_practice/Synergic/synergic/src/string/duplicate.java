package string;

import java.util.*;

public class duplicate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the Sentence: ");
		String str = sc.nextLine().replace(" ", "");
		System.out.println(str);

		StringBuilder sb1 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(char obj : set) {
			sb1.append(obj);
		}
		System.out.println(sb1);
	}
}