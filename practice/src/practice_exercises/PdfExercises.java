package practice_exercises;

import java.util.Scanner;

public class PdfExercises {
	public static void findEvenNumbers(Scanner sc) {
		int input;
		String output = "";
		System.out.println("Please enter your number: ");
		
		input = sc.nextInt();
		
		for (int i = 2; i<input;i+=2) {
			output += i + " ";
		}
		System.out.println("Output: " + output);
	}
	
	public static void findMaxNumber(Scanner sc) {
		int num1;
		int num2;
		System.out.println("Please enter your two numbers: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int largest = Math.max(num1, num2);
		
		System.out.println("The largest number is: " + largest);
	}
	
	public static void printPyramid(Scanner sc) {
	    String input;
	    System.out.println("Please enter your name: ");
	    input = sc.nextLine();
	    
	    for (int i = 0; i < input.length(); i++) {
	        for (int j = 0; j < input.length() - i - 1; j++) {
	            System.out.print(" ");
	        }
	        
	        for (int j = 0; j <= i; j++) {
	            System.out.print(input.charAt(j)+" ");
	        }
	        
	        System.out.println(); 
	    }
	    
	}
	
	public static void printMixedCase(Scanner sc) {
	    String input;
	    System.out.println("Please enter your string: ");
	    input = sc.nextLine();
	    String output = "";
	    
	    for(int i=0;i<input.length();i++) {
	    	String letter = "";
	    	letter += input.charAt(i);
	    	if (i%2==0) {
	    		letter = letter.toLowerCase();
	    	}
	    	else {
	    		letter = letter.toUpperCase();

	    	}
	    	output += letter;

	    }
	    System.out.printf("Output: %s", output);
	}
	
	public static void parseLine(Scanner sc) {
	    String input;
	    System.out.println("Please enter your string: ");
	    input = sc.nextLine();
	    String output = "";
	    output = input.replaceAll(" ", "");
	    output = output.replaceAll("[;.,]", "\n");
	    System.out.printf("Output: %s", output);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		findEvenNumbers(sc);
		findMaxNumber(sc);
		printPyramid(sc);
//		printMixedCase(sc);
//		parseLine(sc);
		sc.close();
	}
}
