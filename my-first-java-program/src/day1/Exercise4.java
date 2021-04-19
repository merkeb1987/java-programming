package day1;

public class Exercise4 {

	public static void main(String[] args) {
		// Declaring all the numbers that are given for exercise 4
		int num1 = -5;
		int num2 = -3;
		int num3 = 2;
		int num4 = 3;
		int num5 = 5;
		int num6 = 6;
		int num7 = 8;
		int num8 = 9;
		int num9 = 15;
		int num10 = 20;
		int num11 = 55;

		System.out.println("Exercise 4");
		System.out.println("\ta. " + (num1 + num7 * num6)); // -5+8*6
		System.out.println("\tb. " + (num11 + num8) % num8); // (55+9)%9
		System.out.println("\tc. " + (num10 + num2 * num5 / num7)); // 20 + -3*5 / 8
		System.out.println("\td. " + (num5 + num9 / num4 * num3 - num7 % 3)); // 5 + 15 / 3 * 2 - 8 % 3

	}

}
