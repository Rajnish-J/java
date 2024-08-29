import java.util.*;
import java.util.Map.Entry;

public class Area {
	static HashMap<String, ArrayList> hm = new HashMap<>();
	static ArrayList<Student> al;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		al = new ArrayList<>();
		al.add(new Student(11, "MALE", "ABC", "ABCSCHOOL"));
		al.add(new Student(12, "FEMALE", "EFG", "EFGSCHOOL"));
		hm.put("PORUR", al);
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(new Student(15, "MALE", "hjlejr", "ABCSCHOOL"));
		al1.add(new Student(17, "FEMALE", "EFG", "EFGSCHOOL"));
		hm.put("VADA", al1);
		// print();
		abcschool();
		// AllstudentAge();
	}

	private static void abcschool() {
		ArrayList<Student> sto = new ArrayList<>();
		for (Entry<String, ArrayList> ele : hm.entrySet()) {
			System.out.println(ele);
			ArrayList st = ele.getValue();
			for (int i = 0; i < st.size(); i++) {
				Student stobj = (Student) st.get(i);
				String school = stobj.School;
				System.out.println(stobj.name);
				// if(school.equals("ABCSCHOOL")) {
				// sto.add(stobj);
				// }
			}
		}
		System.out.println(sto);
	}

	private static void AllstudentAge() {
		ArrayList<Integer> stuage = new ArrayList<>();
		for (Entry<String, ArrayList> ele : hm.entrySet()) {
			System.out.println(ele);
			ArrayList st = ele.getValue();
			for (int i = 0; i < al.size(); i++) {
				Student stobj = al.get(i);
				stuage.add(stobj.age);
			}
		}
		System.out.println(stuage);
	}

	// TO PRINT THE DATA

	public static void print() {
		for (Entry<String, ArrayList> ele : hm.entrySet()) {
			System.out.println(ele);
			ArrayList st = ele.getValue();
			for (int i = 0; i < al.size(); i++) {
				Student stobj = al.get(i);

			}
		}
	}

}
