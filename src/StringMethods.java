import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String fullName;
        char initial;
        int lastSpaceLocation;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        fullName = input.nextLine();

        initial = fullName.charAt(0);

        lastSpaceLocation = fullName.lastIndexOf(" ");

        System.out.println("\n" + initial + "\n" + fullName.toUpperCase() + "\n" +
                  fullName.substring(lastSpaceLocation+1,fullName.length()));
    }
}
