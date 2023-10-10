package lesson02;

public class DeclareVariables {

	/*
	 * HW 1 Create a Java Program (class) and name it DeclareVariables. Create
	 * variables for all 8 primitive Data Types (byte, short, int, long, float,
	 * double, char, boolean). I want you to print out each variable on a separate
	 * line and test its number range (capacity).
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

		// boolean only has 2 values

		System.out.println("byte - 8 bit(1 bytes) - " + a);
		System.out.println("short - 16 bit(2 bytes) - " + b);
		System.out.println("int - 32 bit(4 bytes) - " + c);
		System.out.println("long - 64 bit(8 bytes) - " + d);

		System.out.println("\n--------\n");

		System.out.println("float - 32 bit(4 bytes) - " + e);
		System.out.println("double - 64 bit(8 bytes) - " + f);

		System.out.println("\n--------\n");

		System.out.println("char - 16 bit(2 bytes) - " + g);
		System.out.println("boolean - 1 bit - " + h);
		System.out.println(i);

	}

}
