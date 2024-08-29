package sabari;

import java.util.*;

public class Assign {
	static List<String> al = new ArrayList<>();

	public static void main(String[] args) {
		al.add("ELEC_TV");
		al.add("CLOTH_Shirt");
		al.add("ELEC_Laptop");
		al.add("CLOTH_Jeans");
		al.add("ELEC_Smartphone");
		al.add("TOY_Car");

		unique();
		filter("ELEC");
	}

	private static void unique() {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);
			int ind = str.indexOf('_');
			String res = str.substring(0, ind + 1);
			hs.add(res);
		}
		System.out.println(hs);
	}

	private static void filter(String string) {
		List<String> filter = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);
			if (str.contains(string)) {
				filter.add(str);
			}
		}
		System.out.println(filter);

	}
}
