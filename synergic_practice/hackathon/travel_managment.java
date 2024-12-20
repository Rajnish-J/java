package hackathon;

import java.util.*;

public class travel_managment {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<city> obj = new ArrayList<city>();
		
		obj.add(new city("New York", "USA", 8419000, 789.4));
		obj.add(new city("Los Angels", "USA", 3980000, 1214.9));
		obj.add(new city("Tokyo", "Japn", 13969000, 2191));
		obj.add(new city("London", "UK", 8982000, 1572));
		obj.add(new city("Paris", "France", 2148000, 105.4));
		
		System.out.print("Enter the country name: ");
		String country = sc.next();
		
		
		filterCitiesByCountry(country, obj);
		
		calculateAveragePopulation(obj);
	}
	
	public static void filterCitiesByCountry(String country, ArrayList<city> obj) {
		ArrayList<city> res_country = new ArrayList<city>();
		
		for(int i = 0; i<obj.size(); i++) {
			city c = obj.get(i);
			String ctr = obj.get(i).getCountry();
			if(country.equals(ctr)) {
				res_country.add(c);
			}
		}
		System.out.println(res_country);
	}
	
	public static void calculateAveragePopulation(ArrayList<city> obj) {
		long res = 0;
		int size = obj.size();
		
		for(int i = 0; i<obj.size(); i++) {
			long pop = obj.get(i).getPopulation();
			res += pop;
		}
		
		long avg = res / size;
		System.out.println(avg);
	}
	
}
