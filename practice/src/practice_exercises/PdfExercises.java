package practice_exercises;

import java.util.Scanner;

public class PdfExercises {
	public static void findEvenNumbers() {
		int input;
		String output = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		
		input = sc.nextInt();
		
		for (int i = 2; i<input;i+=2) {
			output += i + " ";
		}
		System.out.println("Output: " + output);
		sc.close();
	}
	
	public static void findMaxNumber() {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your two numbers: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int largest = Math.max(num1, num2);
		
		System.out.println("The largest number is: " + largest);
		sc.close();
	}
	
	public static void printPyramid() {
	    String input;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter your name: ");
	    input = sc.nextLine();
	    
	    for (int i = 0; i < input.length(); i++) {
	        // Print leading spaces to center-align the characters
	        for (int j = 0; j < input.length() - i - 1; j++) {
	            System.out.print(" ");
	        }
	        
	        // Print characters in ascending order for the left slope
	        for (int j = 0; j <= i; j++) {
	            System.out.print(input.charAt(j)+" ");
	        }
	        
	        System.out.println(); 
	    }
	    
	    sc.close();
	}


	public static void main(String[] args) {
		findEvenNumbers();
		findMaxNumber();
		printPyramid();
	}
}
