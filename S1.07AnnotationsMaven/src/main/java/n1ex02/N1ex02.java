package n1ex02;

public class N1ex02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		OnlineWorker javi = new OnlineWorker("Javi", "Peña");
		System.out.println(javi.getName2());
		
		OnSiteWorker pepe = new OnSiteWorker("Pepe","EtSech");
		System.out.println(pepe.getSurname2());
		
		Worker carlos = new Worker("Carlos", "Ortega");
		System.out.println(carlos.calculateSalary(42.2f));
		
	}

}
