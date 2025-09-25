import java.util.Scanner;

public class NeuroConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?:");
        double amount = scanner.nextDouble();

        scanner.nextLine();
        converter(amount);
    }

    public static void converter(double amount) {
        // -- Write your code below
        System.out.println((int) amount);
        amount = (int) Math.round((amount - (int) amount) * 100);
        int fourNines = (int) amount / 49;
        System.out.println(fourNines);
        amount %= 49;
        int nines = (int) amount / 9;
        System.out.println(nines);
        amount %= 9;
        System.out.println((int) amount);

        // Don't forget to print the output [check the requirements]

        // -- Write your code above
    }
}
