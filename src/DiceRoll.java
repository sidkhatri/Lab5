import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String choice = "y";

		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("");

		while (choice.equalsIgnoreCase("Y")) {

			System.out.println("How many sides should each die have?");
			rollDiceOne(); // Calling method

			System.out.println("");
			System.out.println("Roll again? (y/n)");
			choice = scan.nextLine();
		}
		System.out.println("");
		System.out.println("Thank you for playing at the Grand Circus Casino!");
		scan.close();
	}

	// Method for generating random numbers for both Dice
	public static int rollDiceOne() {
		Random randGen = new Random();
		int userInput;
		int diceFaceTwo;
		int diceFaceOne;

		Scanner scan = new Scanner(System.in);

		userInput = scan.nextInt();
		System.out.println("Roll 1:");
		diceFaceOne = (randGen.nextInt(userInput) + 1);
		diceFaceTwo = (randGen.nextInt(userInput) + 1);
		System.out.println(diceFaceOne + "  " + diceFaceTwo);

		// Determining if dice reads Snake Eyes, Craps or Box cars and printing the
		// appropriate outcome to the console.
		if ((diceFaceOne + diceFaceTwo) == 2) {
			System.out.println("Snake eyes!");
		} else if ((diceFaceOne + diceFaceTwo) == 7) {
			System.out.println("Craps!");
		} else if ((diceFaceOne + diceFaceTwo) == 12) {
			System.out.println("Box cars!");
		}

		return diceFaceOne;
	}

}
