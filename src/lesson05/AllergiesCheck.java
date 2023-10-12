package lesson05;

public class AllergiesCheck {

	/*
	 * Homework 1:
	 * 
	 * Write a java program to check if a patient has allergies. If the patient does
	 * not have allergies print "You’re healthy!". If the patient has allergies,
	 * check if it is a peanut allergy, lactose allergy, bee allergy or seafood
	 * allergy and print a statement telling the patient "Don’t eat ___". (fill the
	 * line with the food names – peanut, seafood etc.)
	 */

	public static void main(String[] args) {

		String allergyType = "Lactose";
		String allergyFood = "No Allergy, Eat Freely!";

		switch (allergyType) {
		case "Peanut":
			allergyFood = "Don't eat Peanuts!";
			break;
		case "Lactose":
			allergyFood = "Don't eat Lactose Foods!";
			break;
		case "Bee":
			allergyFood = "Don't eat Bee Foods!";
			break;
		case "Seafood":
			allergyFood = "Don't eat Seafood!";
			break;
		}

		System.out.println(allergyFood);
	}
}
