
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		String response;
		System.out.println("Welcome to Grand Circus Casino!");
		// get some input from the user
		System.out.println("How many sides should each die have?");
		Scanner sides = new Scanner(System.in);
		int numSides = sides.nextInt();
		System.out.println("Your dice each have " + numSides + " sides.");
		// random roll
		do {
			int roll1 = generateRandomDieRoll(numSides);
			int roll2 = generateRandomDieRoll(numSides);
			System.out.println("Roll 1: " + roll1);
			System.out.println("Roll 2: " + roll2);
			// fancy names for some outcomes
			if ((roll1 == roll2) && (roll1 != 1 && roll1 != 6)) {
				System.out.println("Two of a kind!");
			} else if (roll1 + roll2 == 2) {
				System.out.println("Snake eyes!");
			} else if (roll1 + roll2 == 21) {
				System.out.println("Blackjack!");
			} else if (roll1 == roll2 && roll1 == 6)
				System.out.println("Box cars!");

			System.out.println("Would you like to roll again? Y/N");
			Scanner rollAgain = new Scanner(System.in);
			response = rollAgain.nextLine();

		} while (response.equalsIgnoreCase("Y"));
		// encourage more gambling
		System.out.println("You can't win if you don't play!");
		// just kidding get some help
		System.out.println("Michigan's Problem Gambling Helpline: 1-800-270-7117");
	}
	public static int generateRandomDieRoll(int numSides) {
		int randomRoll = (int) (Math.random() * numSides + 1);
		
		return randomRoll;
	}
}
