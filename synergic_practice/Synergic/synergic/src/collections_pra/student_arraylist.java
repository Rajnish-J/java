package collections_pra;

import java.util.ArrayList;

public class student_arraylist {

	static ArrayList<student> student = new ArrayList<student>();

	public static void main(String[] args) {
		student.add(new student(334, "Rajnish", 22));
		student.add(new student(330, "raghul", 21));
		student.add(new student(343, "sam", 19));

//		separate name
		ArrayList<String> res_sep_name = sep_name(student);
		System.out.println(res_sep_name);
		
//		age check
		ArrayList<String> res_age_check = age_greaterthan_twenty(student);
		System.out.println(res_age_check);		

	}

	public static ArrayList<String> sep_name(ArrayList<student> stud) {
		ArrayList<String> sep_name = new ArrayList<String>();
		for (student obj : student) {
			String name = obj.getName();
			sep_name.add(name);
		}
		return sep_name;
	}
	
	public static ArrayList<String> age_greaterthan_twenty(ArrayList<student> stud) {
		ArrayList<String> age_check = new ArrayList<String>();
		for (student obj : student) {
			int age = obj.getAge();
			String name = obj.getName();
			if(age >= 20) {
				age_check.add(name);
			}
		}
		return age_check;
	}
}
