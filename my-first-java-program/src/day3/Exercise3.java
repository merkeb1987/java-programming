package day3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes integer input ( 1 to 7)  from the a user,
		 * 1 representing Monday to 7 representing Sunday. 
		 * The program should decide whether the day input is a weekend or a weekday.(Use switch statement)
		 * Enter number: 1
		 * You entered 1 for Monday
		 * Monday is a weekday
		 */

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a number from 1 to 7: ");

		int num = s.nextInt(); // Read number
		System.out.println("Number you entered is: " + num); // Output number

	}

}
