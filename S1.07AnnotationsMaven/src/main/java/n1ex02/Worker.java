package n1ex02;

public class Worker {
	protected String name;
	protected String surname;
	protected final float pricePerHour = 9.72f;

	public Worker(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	
	@Deprecated
	public String getName2() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	@Deprecated
	public String getSurname2() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getPricePerHour() {
		return pricePerHour;
	}
	
@Deprecated
	public float calculateSalary(float hours) {
		
		float salary = pricePerHour * hours;
	
		return salary;
	}
}
