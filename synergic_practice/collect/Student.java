public class Student {
	private int age;
	private String name;
	private String gender;
	private String school;

	public Student(int age, String name, String gender, String school) {
		this.age = age;
		this.gender = gender;
		this.school = school;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", gender=" + gender + ", school=" + school + "]";
	}

}
