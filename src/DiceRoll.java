import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declare all of my variables
		int sides;
		String choice = "y"; 
		
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("");
		
		while(choice.equalsIgnoreCase("Y")) 
		{
			
			System.out.println("How many sides should each die have?");
			sides = scan.nextInt();
			int sideOne = rollDiceOne(sides); //Calling method 1 and putting value into sideOne
			int sideTwo = rollDiceTwo(sides); //Calling method 2 and putting value into sideTwo
		
			//Printing all results to the console  
			System.out.println("");
			System.out.println("Roll 1:");
			System.out.println (sideOne);
			System.out.println (sideTwo);
			
		  //Determining if dice reads Snake Eyes, Craps or Box cars and printing the appropriate outcome to the console.	
			if((sideOne + sideTwo) == 2) {
				System.out.println("Snake eyes!");
			} else if((sideOne + sideTwo) == 7) {
				System.out.println("Craps!"); 
			} else if((sideOne + sideTwo) == 12) {
				System.out.println("Box cars!");
			}
			
			scan.nextLine();
			System.out.println("");
			System.out.println("");
			System.out.println("Roll again? (y/n)"); 
			choice = scan.nextLine();
		}
		System.out.println("Thank you for playing at the Grand Circus Casino!");
		scan.close();	
		
	}
	
	//Method for generating random numbers for Dice One
	public static int rollDiceOne(int diceFaceOne) {
		Random randGen = new Random();
		
		diceFaceOne = (randGen.nextInt(6) + 1);  //This ensures numbers are from 1-6; (otherwise it'd be from 0-5)
		
		return diceFaceOne;
	}
	
	//Method for generating random numbers for Dice Two
	public static int rollDiceTwo(int diceFaceTwo) {
		Random randGen = new Random();
		
		diceFaceTwo = (randGen.nextInt(6) + 1); 
		
		return diceFaceTwo;
	}
}
