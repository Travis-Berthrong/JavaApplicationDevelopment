package oopsConcept;

public class InheritanceExample {
	
	public void inherit() {
		System.out.println("Hello");
	}
}

class InheritanceExample1 extends InheritanceExample {
	@Override
	public void inherit() {
		System.out.println("Java!!");
	}
}
