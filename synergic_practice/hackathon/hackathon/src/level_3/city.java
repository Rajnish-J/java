package level_3;

public class city {

	private String city_name;
	private String country;
	private long population;
	private double area;
	
	public city(String city_name, String country, long population, double area) {
		this.city_name = city_name;
		this.country = country;
		this.population = population;
		this.area = area;
	}
	
	public city() {
		
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "city [city_name=" + city_name + ", country=" + country + ", population=" + population + ", area=" + area
				+ "]";
	}
	
	

}
