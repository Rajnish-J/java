package sabari;
// ! Finding the count of the vowels character in the string

import java.util.*;

public class Assignment_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String word = sc.next();
		int c = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
					|| word.charAt(i) == 'U' || word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
					|| word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				c++;
			}
		}
		System.out.println("Number of Vowels :" + c);
	}
}