package n1ex01;

public class N1ex01 {

	public static void main(String[] args) {
		
		Worker carlos = new Worker("Carlos", "Ortega");
		OnlineWorker javi = new OnlineWorker("Javi", "Peña");
		OnSiteWorker pepe = new OnSiteWorker("Pepe","EtSech");
		
		System.out.println(javi.getName()+" "+javi.getSurname()+", Te un sou de: "+javi.calculateSalary(40.2f)+" Euros");
		System.out.println(pepe.getName()+" "+pepe.getSurname()+", Te un sou de: "+pepe.calculateSalary(40.2f)+" Euros");
		System.out.println(carlos.getName()+" "+carlos.getSurname()+", Te un sou de: "+carlos.calculateSalary(40.2f)+" Euros");;
	}

}
