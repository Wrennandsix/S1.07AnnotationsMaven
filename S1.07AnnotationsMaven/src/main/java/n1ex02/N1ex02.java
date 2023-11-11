package n1ex02;

public class N1ex02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		OnlineWorker javi = new OnlineWorker("Javi", "Peña");
		
		
		OnSiteWorker pepe = new OnSiteWorker("Pepe","EtSech");
		
		
		Worker carlos = new Worker("Carlos", "Ortega");
				
		System.out.println(javi.getName2()+" "+javi.getSurname2()+", Te un sou de: "+javi.calculateSalary(40.2f)+" Euros");
		System.out.println(pepe.getName2()+" "+pepe.getSurname2()+", Te un sou de: "+pepe.calculateSalary(40.2f)+" Euros");
		System.out.println(carlos.getName()+" "+carlos.getSurname()+", Te un sou de: "+carlos.calculateSalary(40.2f)+" Euros");
		
	}

}
