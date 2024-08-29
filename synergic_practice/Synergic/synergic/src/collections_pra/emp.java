package collections_pra;

public class emp {

	private String name;
	private int age;
	private double sal;

	public emp(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public emp() {

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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "emp [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}

}