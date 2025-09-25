import java.util.Scanner;

public class RPSLO {

            public static void win() {System.out.println("You win!");}

            public static void lose() {System.out.println("Computer wins!");}

    public static void main(String[] args) {
        System.out.println("Enter your play: R, P, S, L, O");
        Scanner scanner = new Scanner(System.in);
        char userChoice = Character.toUpperCase(scanner.next().charAt(0));
        char[] choices = {'R', 'P', 'S', 'L', 'O'};
        int i = (int) (Math.random() * 5);
        char computerChoice = choices[i];
        System.out.println("Computer play is " + computerChoice);
        if(userChoice == computerChoice) {System.out.println("It is a tie!");}

        switch (userChoice) {
            case 'R':
                if(computerChoice == 'L') {win();}
                if(computerChoice == 'S') {win();}
                if(computerChoice == 'P') {lose();}
                if(computerChoice == 'O') {lose();}
                break;
            
            case 'P':
                if(computerChoice == 'O') {win();}
                if(computerChoice == 'R') {win();}
                if(computerChoice == 'S') {lose();}
                if(computerChoice == 'L') {lose();}
                break;

            case 'S':
                if(computerChoice == 'L') {win();}
                if(computerChoice == 'P') {win();}
                if(computerChoice == 'R') {lose();}
                if(computerChoice == 'O') {lose();}    
                break;

            case 'L':
                if(computerChoice == 'P') {win();}
                if(computerChoice == 'O') {win();}
                if(computerChoice == 'R') {lose();}
                if(computerChoice == 'S') {lose();}
                break;

            case 'O':
                if(computerChoice == 'R') {win();}
                if(computerChoice == 'S') {win();}
                if(computerChoice == 'P') {lose();}
                if(computerChoice == 'L') {lose();}
                break;
            default:
                System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
        }
        scanner.close();
    }
}