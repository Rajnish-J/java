import java.util.*;
public class setprb {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	HashSet<Student> hs=new HashSet<>();
	int n=sc.nextInt();
	while(n-->0) {
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter Gender");
		String gender=sc.next();
		System.out.println("Enter School");
		String school=sc.next();
		hs.add(new Student(age,gender,name,school));
	}
	System.out.println(hs);
}
}
