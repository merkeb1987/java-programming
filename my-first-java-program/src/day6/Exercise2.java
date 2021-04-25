package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		// Write a Java program to test if an array contains a specific value
		
		String[] typeOfJuice = {"Mango", "Avocado", "Papaya", "Strawberry Banana", "Berries"};
		List<String> juiceList = new ArrayList<>(Arrays.asList(typeOfJuice));
		
		System.out.println(juiceList.contains("Banana"));


	}

}
