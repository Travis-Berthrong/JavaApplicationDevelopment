package lecture3package;

import java.util.Scanner;

public class StringExercise {
	String input;
	String output;
	
	public void ChangeCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string: ");
		
		input = sc.next();
		
		if(input.equals(input.toLowerCase())) {
			output = input.toUpperCase();
		}
		else {
			output = input.toLowerCase();
		}
		System.out.println(output);
		sc.close();
	}
	

}
