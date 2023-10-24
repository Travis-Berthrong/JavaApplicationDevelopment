package oopsconcept;

import java.util.Scanner;

public abstract class AbstractImplementation {
	
	abstract void customerPin();;

}

class Bank extends AbstractImplementation {
	@Override
	void customerPin() {
		System.out.print("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		System.out.println("Enter amount: ");
		float amt = sc.nextFloat();
		System.out.println("Withdraw cash & card!");
		
	}
}
