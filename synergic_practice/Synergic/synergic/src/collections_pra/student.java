package collections_pra;

public class student {
	private int roll_no;
	private String name;
	private int age;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + "]";
	}

	public student(int roll_no, String name, int age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
}
