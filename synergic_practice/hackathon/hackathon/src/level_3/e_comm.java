package level_3;

import java.util.*;

public class e_comm {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> prod = new ArrayList<String>();

		prod.add("ELEC_TV");
		prod.add("CLOTH_Shirt");
		prod.add("ELEC_Laptop");
		prod.add("CLOTH_Jeans");
		prod.add("ELEC_Smartphone");
		prod.add("TOY_Car");

		System.out.print("Enter the prefix: ");
		String pre = sc.next();
		ArrayList<String> res = filterByCategory(pre, prod);
		System.out.println(res);

//		System.out.println(prod);
	}

	public static ArrayList<String> filterByCategory(String pre, ArrayList<String> prod) {
		ArrayList<String> res = new ArrayList<String>();

		for (int i = 0; i < prod.size(); i++) {
			String str = prod.get(i);
			if (pre.equals(pre.contains(str))) {
				res.add(str);
			}
		}

		return res;
	}

	public static void countUniqueCategories(ArrayList<String> prod) {
		ArrayList<String> res = new ArrayList<String>();

		for (int i = 0; i < prod.size(); i++) {
			String check = "ELEC_";
			String str = prod.get(i);
			
		}

//		return res;
	}

}
