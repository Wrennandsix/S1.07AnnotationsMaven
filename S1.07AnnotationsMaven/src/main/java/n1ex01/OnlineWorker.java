package n1ex01;

public class OnlineWorker extends Worker {

	static float internet = 50.6f;
	
	public OnlineWorker(String name, String surname) {
		super(name, surname);
		
	}
	@Override
	public float calculateSalary(float hours) {
		
		return super.calculateSalary(hours)+(internet);
	}

}
