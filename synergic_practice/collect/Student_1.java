package Map;

public class Student {
	public int age;
	public String gender;
	public String name;
	public String School;
	
	Student(int age,String gender,String name,String school){
		this.age=age;
		this.gender=gender;
		this.name=name;
		this.School=school;
	}
	public String toString() {
		return "Student [age=" + age + ", gender=" + gender + ", name=" + name + ", School=" + School + "]";
	}
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSchool() {
//		return School;
//	}
//
//	public void setSchool(String school) {
//		School = school;
//	}
	
}
