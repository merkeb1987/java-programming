package day7;

public class Polygon {
	double lengthOfSide;
	int numOfSides;
	String color;
	
	public Polygon() {
		
	}

	public double Polygon(double lengthOfSide, int numOfSides) {
		double parimeter = lengthOfSide * numOfSides;
		return parimeter;
	}

}
