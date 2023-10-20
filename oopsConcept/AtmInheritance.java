package oopsConcept;

public class AtmInheritance {

	public void atmprocess() {
		System.out.println("User inserts card...");
	}
}

class AtmInheritance1 extends AtmInheritance{
	@Override
	public void atmprocess() {
		System.out.println("Pin entered.... 1234");
	}
}

class AtmInheritance2 extends AtmInheritance{
	@Override
	public void atmprocess() {
		System.out.println("Amount withdrawn!");
	}
}
