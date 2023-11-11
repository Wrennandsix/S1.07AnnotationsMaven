package n1ex01;

public class OnSiteWorker extends Worker {
	static float fuel = 200.5f;
	
	public OnSiteWorker(String name, String surname) {
		super(name, surname);
	}

	@Override
	public float calculateSalary(float hours) {
	
		return super.calculateSalary(hours)+(fuel);
	}

}