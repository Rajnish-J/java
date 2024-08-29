package sabari;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class H_City {
	static String state;
	static String city;
	static long pop;
	static double area;
	static Set<H_City> hs = new HashSet<>();

	H_City(String state, String city, long pop, double area) {
		this.state = state;
		this.city = city;
		this.pop = pop;
		this.area = area;
	}

	public static void main(String[] args) {
		// al=new ArrayList<>();
		hs.add(new H_City("Paris", "France", 2148000l, 105.4));
		hs.add(new H_City("Paris", "USA", 2148000l, 105.4));
		hs.add(new H_City("Los Angles", "USA", 2148000l, 105.4));
		filterCitiesByCountry("USA");
	}

	private static void filterCitiesByCountry(String str) {

		System.out.println(hs);
	}

}
