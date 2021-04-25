package day6;

public class Exercise4 {

	public static void main(String[] args) {
		// Write a Java program to copy an array by iterating the array.

		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		int[] copyOfNumbers = new int[6];

		for (int i = 0; i < numbers.length; i++) {
			copyOfNumbers[i] = numbers[i];
			System.out.println(copyOfNumbers[i]);
		}

	}

}
