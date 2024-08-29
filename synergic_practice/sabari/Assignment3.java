package sabari;
// ! collection CRUD

import java.util.*;
import java.util.Map.Entry;

public class Assignment3 {
	static Map<Integer, List<String>> hm = new HashMap<>();
	static List<String> al;
	static List<Integer> arraylist;

	public static void main(String[] args) {
		add(10, "alice,deepak");
		add(30, "alice1,deepak5");
		add(20, "alice6,deepak");
		add(10, "alice7,deepak");
		remove("alice", 10);
		print(10);
		System.out.println(hm);
		sortByGrade();
		numberOfStudent(hm);
	}

	private static void numberOfStudent(Map<Integer, List<String>> hm1) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Entry<Integer, List<String>> ent : hm1.entrySet()) {
			int Grade = ent.getKey();
			al = ent.getValue();
			hm.put(Grade, al.size());
		}
		System.out.println("Number of Student in Each Grade");
		System.out.println(hm);
	}

	private static void sortByGrade() {
		// TODO Auto-generated method stub
		arraylist = new ArrayList<>();
		arraylist.addAll(hm.keySet());
		al = new ArrayList<String>();
		Collections.sort(arraylist);
		System.out.println(arraylist);
		for (int i = 0; i < arraylist.size(); i++) {
			for (Entry<Integer, List<String>> ele : hm.entrySet()) {
				if (arraylist.get(i) == ele.getKey()) {
					al.addAll(ele.getValue());
				}
			}
		}
		System.out.println("Sort By Grade");
		System.out.println(al);
	}

	private static void print(int Grade) {
		// TODO Auto-generated method stub
		al = hm.get(Grade);
		System.out.println(al);
	}

	private static void remove(String str, int Grade) {
		// TODO Auto-generated method stub
		al = hm.get(Grade);
		if (al.contains(str)) {
			al.remove(str);
		}
		if (al.size() == 0) {
			hm.remove(Grade);
		}
		System.out.println("Successfully Removed");
	}

	private static void add(int Grade, String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(",");
		if (hm.containsKey(Grade)) {
			al = hm.get(Grade);
			for (int i = 0; i < arr.length; i++) {
				al.add(arr[i]);
			}
		} else if (!hm.containsKey(Grade)) {
			al = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				al.add(arr[i]);
			}
			hm.put(Grade, al);
		}
		System.out.println("Sucessfully Added");
	}
}
