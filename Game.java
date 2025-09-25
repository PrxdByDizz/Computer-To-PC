import java.util.Scanner;
import java.time.Year;

public class Game {
	private static Scanner scanner;

	public static void main(String[] args) {
		// ----- Correct the code below
		System.out.println(
				"	         __                    _          ___       __                 __                 \n"
						+ "		/ /__  ____________  _( )_____   /   | ____/ /   _____  ____  / /___  __________  \n"
						+ "	   __  / / _ \\/ ___/ ___/ / / /// ___/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\\n"
						+ "	  / /_/ /  __/ /  / /  / /_/ / (__  )  / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/ \n"
						+ "	  \\____/\\___/_/  /_/   \\__, / /____/  /_/  |_\\__,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/  \n"
						+ "			      /____/  	\n\nby: Enrique M.\n");
		// ----- Correct the code above

		scanner = new Scanner(System.in);
		// ----- Write your code below
		System.out.print("What is your name?: ");
		String userName = scanner.nextLine();
		System.out.printf("Hi %s!\nWhen were you born (year)?: ", userName);
		int yearBorn = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character left by nextInt()
		System.out.printf("You are %d years old.", calculateAge(yearBorn));
		int stateId = 0;
		String input = "";
		printStage(stateId);

		while (stateId != 666) {
			System.out.print("What would you want to do?: ");
			input = scanner.nextLine().toLowerCase().trim();
			if (input.equals("quit")) {
				System.out.println("Goodbye!");
				stateId = 666;
				continue;
			}
			if (!getInput(input, stateId)) {
				continue;
			}
			getInput(input, stateId);
			stateId = takeAction(input, stateId);
			printStage(stateId);
		}
		scanner.close();
	}

	public static boolean getInput(String input, int currentState) {
		switch (input) {
			case "open the door":
			case "go north":
			case "go south":
			case "go east":
			case "go west":
			case "take item":
			case "drop item":
			case "use item":
				takeAction(input, currentState);
				return true;

			case "quit":
				takeAction(input, 666);
				return false;

			default:
				System.out.println("Invalid input");
				return false;
		}
	}

	public static int takeAction(String action, int currentState) {
		if (action.equals("open the door") && currentState == 0)
			return 1;
		else if (action.equals("take item") && currentState == 0)
			return 2;
		else if (action.equals("go east") && currentState == 1)
			return 3;
		else
			return 0;
	}

	public static void printStage(int currentState) {
		if (currentState == 1)
			System.out.println("You are in a long hallway. There’s a man wearing glasses at the end of it,\n" + //
					"he looks harmless. West is a wall, east is the man, to the north is nothing\n" + //
					"but empty offices, a desperate sight. The carpeting in the hallway feels\n" + //
					"soft, you hear the clicking of a mouse in the distance. Your office is south\n" + //
					"(behind you).");
		else if (currentState == 2)
			System.out.println("You take the calculator from your desk. It’s a Casio FX-85gt Plus. The\n" + //
					"display shows the number 0.1134. You turn it upside down; now the Casio greets you with a friendly \n“hello”, nice. You hold the calculator in your hand.");
		else if (currentState == 3)
			System.out.println("The man greets you and starts endlessly talking to you about his children\n" + //
					"and his holiday to Benidorm. You die of boredom.");
		else
			System.out.println("You are standing in an abandoned university office. There are neither\n" + //
					"students nor teachers around you. There’s a table in front of you with\n" + //
					"various papers, pens, a small puzzle toy, and a calculator. A large window\n" + //
					"shows an empty office building; there are no Zombies in the empty building\n" + //
					"(as far as you can tell). Behind you is a dark and mysterious door that\n" + //
					"leads to a well-lit corridor with a fireproof ceiling and floor. You feel\n" + //
					"a sense of Wi-Fi around you, the grinding of an LCD-operated coffee\n" + //
					"machine can be heard in the distance. You are not thirsty, but you rather\n" + //
					"have a craving for justice.");

	}

	public static int calculateAge(int birthYear) {
		Year currentYear = Year.now();
		return currentYear.getValue() - birthYear;
	}

}