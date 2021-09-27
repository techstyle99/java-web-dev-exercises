package exercises;
import java.util.Scanner;


public class RecArea {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("give me the length of the rectangle: ");
        Double length = input.nextDouble();
        System.out.println("give me the width of the rectangle: ");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

}
