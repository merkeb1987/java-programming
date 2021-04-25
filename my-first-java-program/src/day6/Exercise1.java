package day6;

public class Exercise1 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array integers.

		int[] studentScore = new int[10];

		studentScore[0] = 80;
		studentScore[1] = 90;
		studentScore[2] = 88;
		studentScore[3] = 70;
		studentScore[4] = 80;
		studentScore[5] = 85;
		studentScore[6] = 72;
		studentScore[7] = 60;
		studentScore[8] = 64;
		studentScore[9] = 55;

		int sum = 0;

		for (int i = 0; i < studentScore.length; i++) {

			sum = sum + studentScore[i];
		}

		int average = sum / studentScore.length;
		System.out.println("Sum of the Student score is: " + sum);
		System.out.println("The Average is: " + average);

	}
}
