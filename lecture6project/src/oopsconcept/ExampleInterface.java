package oopsconcept;

interface ExampleInterface {
	
	void printInfo();
	default void pritInfo() {
		System.out.println("Default Interface Class");
	}
	
	static void print() {
		System.out.println("Static Interface Class");
	}
}

abstract class AbstractionExample{
	
	abstract void printInfo();
	void print() {
		System.out.println("Abstract class");
	}
}

class Child extends AbstractionExample implements ExampleInterface {

	@Override
	public void printInfo() {
		super.print();
		System.out.println("Class child");		
	}
	
}
