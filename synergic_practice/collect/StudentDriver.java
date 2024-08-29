import java.util.*;
public class StudentDriver {
	static Scanner sc=new Scanner(System.in);
	static HashSet<Student> al=new HashSet<>();
public static void main(String[] args) {
//	while(n-->0) {
//		System.out.println("Enter Sname :");
//		String name=sc.next();
//		System.out.println("Enter Sschool :");
//		String school=sc.next();
//		System.out.println("Enter gender :");
//		String gender=sc.next();
//		System.out.println("Enter age :");
//		int age=sc.nextInt();
//		al.add(new Student(age,name,gender,school));
//	}
	
	
	al.add(new Student(11,"ABC","MALE","ABCSCHOOL"));
	al.add(new Student(17,"EFG","MALE","EFGSCHOOL"));
//	ArrayList<String> nam=new ArrayList<>();
	
	prinname();
	System.out.println(al);
}
private static void prinname() {
	for(Student ele:al) {
		System.out.println(ele.getName());
	}
}
}
