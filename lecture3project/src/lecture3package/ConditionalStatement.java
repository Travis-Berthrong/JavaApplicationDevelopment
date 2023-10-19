package lecture3package;

import java.util.Scanner;

public class ConditionalStatement {

	protected int voting_age = 18;
	public int user_age;
	public int user_day;

	public void VoteCheck() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your age: ");

		user_age = scanner.nextInt();

		if (user_age >= voting_age) {
			System.out.println("You are eligible to vote!");
		} else {
			System.out.println("You are not eligble to vote :(");
		}
		scanner.close();
	}
	
	public void PrintDayName() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number from 1-7: ");
		
		user_day = scanner.nextInt();
		
		switch(user_day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Incorrect input");
		}
		scanner.close();
	}
	
}
