package sabari;

import java.util.*;

public class H_Citymain {
	static List<H_City> al;

	public static void main(String[] args) {
		al = new ArrayList<>();
		al.add(new H_City("Paris", "France", 2148000l, 105.4));
		al.add(new H_City("Paris", "USA", 2148000l, 105.4));
		al.add(new H_City("Paris", "USA", 2148000l, 105.4));
		filter("USA");
	}

	private static void filter(String string) {
		// TODO Auto-generated method stub
		System.out.println(al);
		for (H_City ele : al) {
			System.out.println(ele.getstate());
		}
	}

}
