package lesson05;

public class EvenOdd {

	/*
	 * *Interview Question: Write a Java Program to check whether number is Even or
	 * Odd.
	 */

	public static void main(String[] args) {

		int num = 10;
		String evenOdd = "";

		if (num % 2 == 0) {
			evenOdd = num + " is an even number!";
		} else {
			evenOdd = num + " is an odd number!";
		}
		
		System.out.println(evenOdd);
	}
}
