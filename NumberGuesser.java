import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        char gaming = 'y';
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to number guessing!");
        while(gaming == 'y') {
            System.out.print("Think of a boundary, what is your lower boundary?: ");
            int i = s.nextInt();
            System.out.print("What is your upper boundary?: ");
            int n = s.nextInt();
            int guess = 0;
            int randomInt = (int)(Math.random() * (n - i + 1)) + i;
            System.out.println("Alright! I just thought of a number in that boundary\nnow it's time for the fun, what number do you think i guessed?: ");
            guess = s.nextInt();
                while(guess != randomInt) {
                    if(guess > randomInt) {System.out.println("Too high, think again!");
                    guess = s.nextInt();}
                    else if(guess < randomInt) {System.out.println("Too low, think again!");
                    guess = s.nextInt();}}
        System.out.println("You got it! it was " + randomInt); 
        System.out.print("Wanna play again? (y/n): ");
        gaming = s.next().charAt(0);
        if (gaming == 'y') continue;
        else if(gaming == 'n') {System.out.println("Goodbye!!!");}
        else {System.out.println("You cant write that!!");}
        s.close();
    }}}