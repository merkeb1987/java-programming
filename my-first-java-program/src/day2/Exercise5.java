package day2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		/*
		 * 5.Write a Java program which reads two integers from the user and prints the
		 * sum and difference both in their own line. ExampleEnter first number: 7Enter
		 * second number: 6Sum: 13Difference: 1
		 */

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter first number: ");
		int num1 = s.nextInt(); // Read number
		System.out.println("Enter second number: ");
		int num2 = s.nextInt(); // Read number
		System.out.println("sum: " + (num1 + num2)); // Output number
		System.out.println("Difference: " + (num1 - num2)); // Output number
	}

}
