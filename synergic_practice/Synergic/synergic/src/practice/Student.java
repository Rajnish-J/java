package practice;

import java.util.*;

public class Student {
	static Map<String,List<String>> stud_list = new HashMap<String,List<String>>();
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		stud_list.put("ECE", Arrays.asList("Rajnish","Raghul","Sanjay"));
		stud_list.put("EEE", Arrays.asList("keerthi raj","ram","Sanjay"));
		stud_list.put("CSE", Arrays.asList("Rajnish","aravind","anna"));
		
		Set<String> keys = stud_list.keySet();

		List<String> dept_namelist = new ArrayList<String>();	
		
		for(String obj : keys) {
			dept_namelist = ((Map<String, List<String>>) keys).get(obj);
		}
	}
	
	
	
	
	
	
	
	
}
