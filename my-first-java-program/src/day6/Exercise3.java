package day6;

public class Exercise3 {

	public static int findIndex(String[] typeOfJuice, String t) {
		if (typeOfJuice == null)
			return -1;
		int len = typeOfJuice.length;
		int i = 0;
		while (i < len) {
			if (typeOfJuice[i] == t)
				return i;
			else
				i = i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// Write a Java program to find the index of an array element.
		

		String[] typeOfJuice = { "Mango", "Avocado", "Papaya", "Strawberry Banana", "Berries" };
		System.out.println("Index position of Avocado is: " + findIndex(typeOfJuice, "Avocado"));

	}

}
