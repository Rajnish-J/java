package collections_pra;

import java.util.*;

public class emp_driver {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, emp> details = new HashMap<Integer, emp>();
	public static void main(String[] args) {
		
//		adding details method:
		System.out.println("After details stored: ");
		add_details();
		System.out.println(details);
		
		
		
		
	}
	
//	method => this methods add the details	
	public static void add_details() {
		
		System.out.print("Enter the number of details to add: ");
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			System.out.print("Enter the ID: ");
			int ID = sc.nextInt();
			
			System.out.print("Enter the name: ");
			String name = sc.next();
			
			System.out.print("Enter the age: ");
			int age = sc.nextInt();
			
			System.out.print("Enter the salary: ");
			double sal = sc.nextDouble();
			
			emp e = new emp(name, age, sal);
			
			details.put(ID, e);
		}
		
		System.out.println("Details stored...");
	}
	
	public static void display() {
		System.out.println(details);
	}
}
