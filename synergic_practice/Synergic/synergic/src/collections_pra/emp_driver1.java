package collections_pra;

import java.util.*;

public class emp_driver1 {
	static Scanner sc = new Scanner(System.in);
	static Map<String, ArrayList<emp>> details_withBranch = new HashMap<String, ArrayList<emp>>();

	public static void main(String[] args) {

//		adding 1st branch details:
		ArrayList<emp> emp_porur = new ArrayList<emp>();
		emp_porur.addAll(Arrays.asList(new emp("Rajnish", 21, 28000), new emp("sabari", 21, 28000)));

//		System.out.println(emp_rec);
		details_withBranch.put("Porur", emp_porur);
//		System.out.println(details_withBranch);

//		adding 2nd branch details
		ArrayList<emp> emp_vada = new ArrayList<emp>();
		emp_vada.addAll(Arrays.asList(new emp("sanjay", 21, 10000), new emp("naren", 21, 10000)));

//		System.out.println(emp_rec);
		details_withBranch.put("OMR", emp_vada);
//		System.out.println(details_withBranch);

//		adding details
//		addEmp();
//		System.out.println("porur: " + details_withBranch);
//		
//		addEmp();
//		System.out.println("vada " + details_withBranch);
		
		
		ArrayList<emp> fname = fname_inbranch('s', details_withBranch);
		System.out.println(fname);
	}

//	public static void addEmp() {
//		System.out.print("Enter the branch: ");
//		String branch = sc.next();
//
//		System.out.print("Enter the number of details to add: ");
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			System.out.println("Enter the " + i + "th employee details: ");
//
//			System.out.print("Enter the ID: ");
//			int ID = sc.nextInt();
//
//			System.out.print("Enter the name: ");
//			String name = sc.next();
//
//			System.out.print("Enter the age: ");
//			int age = sc.nextInt();
//
//			System.out.print("Enter the salary: ");
//			double sal = sc.nextDouble();
//
//			emp e = new emp(name, age, sal);
//
//			emp_.add(e);
//		}
//		details_withBranch.put(branch, emp_rec);
//		System.out.println();
//		System.out.println("added");
//	}
	
	public static ArrayList<emp> fname_inbranch(char fc, Map<String, ArrayList<emp>> hm) {
		
		ArrayList<emp> res = new ArrayList<emp>();
		
		Set<String> keys = hm.keySet();
		Collection<ArrayList<emp>> values = hm.values();
		
		for (ArrayList<emp> empList : values) {
            for (emp e : empList) {
                if (e.getName().charAt(0) == fc) {
//                    System.out.println(e.getName());
                    res.add(e);
                }
            }
        }
		
		
		return res;
	}
	
}