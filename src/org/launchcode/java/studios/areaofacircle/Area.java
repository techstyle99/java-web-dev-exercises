package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import static java.lang.Math.*;


public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double r;
        String s;

        /* adding validation to the program
        if (r < 0 && r.equals("") && (!s.matches("[0-9]+"))){
            System.out.println("invalid input! please enter a correct one");
        } else {
            Double area = Circle.getArea(r); // using another class file method here
            System.out.println("The area of a circle of radius " + r + " is: " + area);
        }
        */

        // bonus question: do-while validation
        do {
            r = input.nextDouble();
            s = input.nextLine();
            Double area = Circle.getArea(r); // using another class file method here
            System.out.println("The area of a circle of radius " + r + " is: " + area);
        } while (r < 0 && r.equals(""));

        input.close();

    }

}
