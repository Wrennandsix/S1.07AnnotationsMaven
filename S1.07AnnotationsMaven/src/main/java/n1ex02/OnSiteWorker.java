package n1ex02;
public class OnSiteWorker extends Worker {

	static float fuel = 200.5f;
	
	public OnSiteWorker(String name, String surname) {
		super(name, surname);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public float calculateSalary(float hours) {
	
		return super.calculateSalary(hours)+(fuel);
	}

}