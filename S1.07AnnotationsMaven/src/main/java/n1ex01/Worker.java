package n1ex01;

public class Worker {
	private String name;
	private String surname;
	private final float pricePerHour = 9.72f;

	public Worker(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getPricePerHour() {
		return pricePerHour;
	}

	public float calculateSalary(float hours) {
		
		float salary = pricePerHour * hours;
	
		return salary;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", surname=" + surname + ", pricePerHour=" + pricePerHour + "]";
	}
}
