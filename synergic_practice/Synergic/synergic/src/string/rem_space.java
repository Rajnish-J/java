package string;

public class rem_space {
	public static void main(String[] args) {
		String str = "I love India  ";
		
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				res += ch;
			}
		}
		
		System.out.println(res);
		
		// another method
		// System.out.println(str.replace(" ", ""));
	}
}
