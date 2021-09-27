package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import static java.lang.Math.*;


public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius number for the circle: ");
        Double r = input.nextDouble();
        Double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);

    }

}
