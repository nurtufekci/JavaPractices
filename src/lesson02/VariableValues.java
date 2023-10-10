package lesson02;

public class VariableValues {

	/*
	 * HW 2 Create a Java program and name it VariableValues In your program create
	 * variables to store all different types of primitive data. Print the value of
	 * each variable. Update value of each variable. Print the value of each
	 * variable after updating.
	 */

	public static void main(String[] args) {

		// numeric data types

		byte a = 127; // up to 128
		short b = 9_999; // 4
		int c = 999_999_999;
		long d = 999_999_999_999_999_999L;

		// decimal data types

		float e = 99999999999999999999999999999999999999.0f;
		double f = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;

		// character and boolean

		char g = 9999;
		boolean h = true;
		boolean i = false;

		System.out.println("Before");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
		g = 257;
		h = false;
		i = true;

		System.out.println("\n\nAfter");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

	}
}
