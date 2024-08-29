package sabari;
// ! collection CRUD

import java.util.*;
import java.util.Map.Entry;

public class Assignment_2Qp_1 {
	static HashMap<String, List<String>> hm = new HashMap<>();

	public static void main(String[] args) {

		add("SABARI", "post1");
		add("SABARI1", "post1");
		add("SABARI", "post4");
		add("SABARI67", "post4");
		add("SABARI5", "post4");
		add("SABARI", "post1");
		
		System.out.println(hm);
		
		delete("SABARI");
		System.out.println();
		
		display();
		System.out.println();
		
		sort();
		System.out.println();
		
		liked();
	}

	private static void liked() {
		Set<String> hs = new HashSet<>();
		for (Entry<String, List<String>> ent : hm.entrySet()) {
			List<String> al = ent.getValue();
			hs.addAll(al);
		}
		List<String> al = new ArrayList<>(hs);
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println("Reverse Order Print");
		System.out.println(al);
	}

	private static void sort() {
		ArrayList<String> name = new ArrayList<>();
		for (Entry<String, List<String>> ent : hm.entrySet()) {
			List<String> al = ent.getValue();
			name.addAll(al);
		}
		Collections.sort(name);
		System.out.println("THE SORTED LIST IS :");
		System.out.println(name);
	}

	private static void display() {
		System.out.println(hm);
	}

	private static void delete(String string) {
		for (Entry<String, List<String>> ent : hm.entrySet()) {
			List<String> al = ent.getValue();
			if (al.contains(string)) {
				al.remove(string);
			}
		}
		System.out.println("SucessFully Removed !!");
	}

	private static void add(String string, String string2) {
		if (hm.containsKey(string2)) {
			List<String> al = hm.get(string2);
			al.add(string);
		} else {
			List<String> al = new ArrayList<>();
			al.add(string);
			hm.put(string2, al);
		}
	}

}