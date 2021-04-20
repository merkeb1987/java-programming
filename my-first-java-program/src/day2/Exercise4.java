package day2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * 4.Write Java program to allow the user to input his/her age. Then the program
		 * will show if the person is eligible to vote. A person who is eligible to vote
		 * must be older than or equal to 18 years old.
		 */

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter your age: ");

		int age = s.nextInt(); // Read number
		if (age >= 18)
			System.out.println("You are eligible to vote"); // Output number
		else
			System.out.println("You are not eligible to vote");
	}

}
