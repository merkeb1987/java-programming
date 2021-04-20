package day2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * 3.Write a Java program to get a number from the user and print whether it is
		 * positive or negative
		 */

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a number: ");

		int num = s.nextInt(); // Read number
		System.out.println("Number you entered is: " + num); // Output number
	}

}
