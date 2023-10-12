package lesson05;

public class GreetDay {

	/*
	 * Homework 2: Write a program to implement following logic using if-else
	 * if-else statement: if hour is less than 12 noon, greet with Good Morning if
	 * hour is greater than or equal 12 noon but less than 3 pm, greet with Good
	 * Afternoon if hour is greater than or equal to 3 pm, greet with Good Evening
	 */

	public static void main(String[] args) {
		int hour = 3;
		String time = "AM";
		String greet = "";

		boolean isTime = time.equalsIgnoreCase("am");

		if (isTime && hour < 12) {
			greet = "Good Morning!";
		} else if (!isTime && (hour < 3 || hour == 12)) {
			greet = "Good AfterNoon!";
			time = "PM";
		}else {
			greet = "Good Evening!";
		}

		System.out.println(greet);
		System.out.println("Time is " + hour + " " + time);
	}

}
