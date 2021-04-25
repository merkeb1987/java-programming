package day7;

public class Exercises1To5 {

	public static void main(String[] args) {
		/*
		 * 1.Write a java program that has a Polygon class with a property Sides and
		 * color. In the main class create 3 objects triangle, rectangle and polygon.
		 * 2.Modify your code from question 1 by adding a constructor for the Polygon
		 * class and user should pass the values for Sides and color during the
		 * initialization. 
		 * 3.Modify your code from question 1 by adding two methods to
		 * display the number of sides and color of the polygon object created. In the
		 * main class call the methods for every object you have created. 
		 * 4.Create a ThreeDimentionalShape class inheriting from Polygon class. Add height
		 * property, create a constructor with Sides , color and Height.Add a method to
		 * display the height. 
		 * 5.In the main class create a rectangular 3D object and
		 * call all the methods to display all the properties
		 */

		Polygon triangle = new Polygon();

		triangle.lengthOfSide = 10.6;
		triangle.numOfSides = 3;
		triangle.Polygon(10.6, 3);

		Polygon rectangle = new Polygon();

		rectangle.lengthOfSide = 10.6;
		rectangle.numOfSides = 4;
		rectangle.Polygon(10.6, 4);

		Polygon polygon = new Polygon();

		polygon.lengthOfSide = 10.6;
		polygon.numOfSides = 6;
		polygon.Polygon(10.6, 6);
	}

}
