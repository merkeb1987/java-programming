package day3;

public class Exercise1 {

	public static void main(String[] args) {
		/*
		 * Write a java program to calculate the sum of first 10 integers. The program
		 * should calculate the sum using for loop sum : 55
		 */

		int sum = 0;// intialise sum

		for (int i = 0; i <= 10; i++) {
			sum = sum + i;

		}
		System.out.println("sum : " + sum);
	}

}
