package lesson03;

public class KmToMileConverter {
	/*
	 * HW 2 Write a java program that converts mile to km and km to miles. Use
	 * scale 1 mile = 1.609344. Print the conversion on the console. For example: 10
	 * miles is 16.09344 kilometers
	 */
	
	public static void main(String[] args) {
		
		double km, mile, converter;
		
		converter = 1.609344;
		mile = 10;
		km = mile * converter;
		
		System.out.println(mile + " miles is " + km + " kilometers!");
		
		double km2, mile2;
		
		km2=10;
		mile2 = km2 / converter;
		
		System.out.println(km2 + " kilometers is " + mile2 + " miles!");

	}
}
