package oopsconcept;

public interface Interface {
	
	void printInfo(); 
	default void printInfo1() {
		System.out.println("Printing from abstract class");
	}
	
	

}
