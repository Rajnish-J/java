package sabari;
import java.util.*;

public class Assignment_5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		char arr[] = str.replace(" ", "").toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
