package lesson04;

public class DoubleComparison {

	/*
	 * HW1 Create a Java program and name it Double Comparison. Declare 2 double
	 * values and if value of first variable is higher then the second, print
	 * “Double value __ is larger than __ .” Otherwise print...
	 * 
	 */

	public static void main(String[] args) {

		double a, b;
		a = 9;
		b = 20;

		if (a > b) {
			System.out.println("Double value " + a + " is larger than " + b);
		} else if (b > a) {
			System.out.println("Double value " + b + " is larger than " + a);
		} else {
			System.out.println("Double value " + a + " is equal to " + b);

		}
	}

}
