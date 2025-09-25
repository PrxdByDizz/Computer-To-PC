import java.util.*;

public class neuro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your amount?");
        double amount = s.nextDouble();
        System.out.println((int) amount);
        amount = (int) Math.round((amount - (int) amount) * 100);
        int fourNines = (int) amount / 49;
        System.out.println(fourNines);
        amount %= 49;
        int nines = (int) amount / 9;
        System.out.println(nines);
        amount %= 9;
        System.out.println((int) amount);
        s.close();
    }
}
