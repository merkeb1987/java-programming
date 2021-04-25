package day3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes a positive integer input and prints all the
		 * positive even number less than the number in order from big to small.(Use do
		 * while loop) Enter number: 7 6 4 2
		 */
		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a positive integer number: ");

		int num = s.nextInt(); // Read number
		int i = num;

		do {
			System.out.println((num % 2 == 0));
			i--;
		}
		
		while (i >= 0);

	}

}
