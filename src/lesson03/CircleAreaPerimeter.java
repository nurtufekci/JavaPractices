package lesson03;

public class CircleAreaPerimeter {

	/*
	 * HW 1 Write a java program to display the area and perimeter of a circle that
	 * has a radius of 5. Use pi = 3.
	 */
	
	public static void main(String[] args) {
		
		int r = 5;
		double pi = 3.14;
		
		//area
		
		double area = pi * (r*r);
		double perimeter = 2 * pi * r;
		
		System.out.println("Area of a circle with a radius of 5 is " + area);
		System.out.println("Perimeter of a circle with a radius of 5 is " + perimeter);
	}

}
