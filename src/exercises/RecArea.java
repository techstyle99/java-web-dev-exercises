package exercises;
import java.util.Scanner;


public class RecArea {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the rectangle: ");
        Double length = input.nextDouble();
        System.out.println("enter the width of the rectangle: ");
        Double width = input.nextDouble();
        double Area = length * width;
        System.out.println("area of the rectangle: " + Area);
    }

}
