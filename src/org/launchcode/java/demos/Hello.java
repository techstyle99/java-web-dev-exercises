package org.launchcode.java.demos;
import java.util.Scanner;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

    }
}
