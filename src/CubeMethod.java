import java.util.Scanner;

public class CubeMethod {
    public static void main(String[] args) {
        int number, numberCubed=0;

        for(int i=0;i<15;i++)
        {
            cube(numberCubed);
        }

    }

    public static int cube(int n){
        int numberCubed;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = input.nextInt();

        numberCubed = n*n*n;

        return numberCubed;
    }
}
