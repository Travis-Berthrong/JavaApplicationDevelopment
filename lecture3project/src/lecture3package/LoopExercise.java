package lecture3package;

import java.util.Scanner;

public class LoopExercise {

	private String user_input;
	String output = "";
	
	public void ReverseNumber( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your number: ");
		
		user_input = sc.nextLine();
		
		int str_length = user_input.length();
		
		for (int i = (str_length-1); i >= 0; i--) {
			output += user_input.charAt(i);
		}
		System.out.println("Reversed string w/ for: "+ output);
		sc.close();
		
		output = "";
		
		int temp = str_length - 1;
		while (temp >= 0) {
			output += user_input.charAt(temp);
			temp--;
		}
		
		System.out.println("Reversed string w/ while: "+ output);
	}
}
