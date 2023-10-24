package oopsconcept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmInheritance atm = new AtmInheritance();
		atm.atmprocess();
		atm = new AtmInheritance1();
		atm.atmprocess();
		atm = new AtmInheritance2();
		atm.atmprocess();
		
		Bank b = new Bank();
		b.customerPin();
		
	}

}
