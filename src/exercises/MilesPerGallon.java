package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the miles driven: ");
        Double miles = input.nextDouble();
        System.out.println("enter the gallons used: ");
        Double gallons = input.nextDouble();
        Double milesPerGallon = miles / gallons;
        System.out.println("here is the miles per gallon: " + milesPerGallon);

    }
}
