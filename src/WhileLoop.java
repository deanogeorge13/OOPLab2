import javax.swing.*;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        double exchange, amountInPounds, amountInEuro;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate: ");
        exchange = input.nextDouble();

        System.out.print("Enter a number to convert: ");
        amountInPounds = input.nextDouble();

        amountInEuro = exchange*amountInPounds;

        System.out.printf("%.2f",amountInEuro);

        while(amountInPounds!=0)
        {
            System.out.print("\nEnter a number to convert: ");
            amountInPounds = input.nextDouble();

            amountInEuro = exchange*amountInPounds;

            System.out.printf("%.2f",amountInEuro);
        }
    }
}
