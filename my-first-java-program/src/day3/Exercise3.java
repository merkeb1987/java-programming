package day3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes integer input ( 1 to 7) from the a user, 1
		 * representing Monday to 7 representing Sunday. The program should decide
		 * whether the day input is a weekend or a weekday.(Use switch statement) Enter
		 * number: 1 You entered 1 for Monday Monday is a weekday
		 */

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a number from 1 to 7: ");

		int num = s.nextInt(); // Read number
		if (num <= 5) {
			switch (num) {
			case 1:
				System.out.println("You entered 1 for Monday\nMonday is a weekday");
				break;
			case 2:
				System.out.println("You entered 2 for Tuesday\nTuesday is a weekday");
				break;
			case 3:
				System.out.println("You entered 3 for Wednesday\nWednesday is a weekday");
				break;
			case 4:
				System.out.println("You entered 4 for Thursday\nThursday is a weekday");
				break;
			case 5:
				System.out.println("You entered 5 for Friday\nFriday is a weekday");
				break;
			}

		} else if (num <= 7) {
			switch (num) {
			case 6:
				System.out.println("You entered 6 for Saturday\nSaturday is a weekend");
				break;
			case 7:
				System.out.println("You entered 7 for Sunday\nSunday is a weekend");
				break;
			}
		} else {
			System.out.println("You have entered Invalid number");
		}

	}

}
