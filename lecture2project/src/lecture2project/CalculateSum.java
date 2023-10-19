package lecture2project;

import java.util.Scanner;

public class CalculateSum {
	
	private int value1;
	public int value2;
	protected String name;
	private int sum;
	
	public void Calculate() {
	Scanner scanner = new Scanner(System.in);
	//name = scanner.nextLine();
	System.out.println("Enter the input: ");
	value1 = scanner.nextInt(); //Getting input as integer
	value2 = scanner.nextInt();
	
	sum = value1 + value2;
	System.out.printf("Sum: %d", sum);
	}
	
}
