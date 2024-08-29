package sabari;
// ! collection CRUD

import java.util.*;

public class Assignment2_qp2 {
	static Map<String, Integer> hm = new HashMap<>();
	static List<String> al = new ArrayList<>();

	public static void main(String[] args) {
		addComments("Supper!!");
		addComments("Wel done");
		addComments("nice Work");
		addComments("Supper work");
		mostRepeat();
		longest();
	}

	private static void longest() {
		// TODO Auto-generated method stub
		String res = "";
		int count = 0;
		for (String word : al) {
			if (word.length() > count) {
				count = word.length();
				res = word;
			}
		}
		System.out.println("Longest word in the comment is :" + res);
	}

	private static void mostRepeat() {
		// TODO Auto-generated method stub
		int max = 0;
		String res = "";
		for (int i = 0; i < al.size(); i++) {
			int count = Collections.frequency(al, al.get(i));
			if (count > max) {
				res = al.get(i);
			}
		}
		System.out.println("Most repeated word in the comment is :" + res);
	}

	private static void addComments(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split("\\s+");
		hm.put(str, arr.length);
		for (String word : arr) {
			al.add(word);
		}
	}
}