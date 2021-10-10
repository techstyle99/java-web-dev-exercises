package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebook {

    public static void main(String[] args) {
        // define data types for this map's key, value pair;
        // call HashMap constructor on the right side of the assignment (no need to specify datatype again)
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));
        System.out.println(students);

//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//        // iterator variable: student
//        // Map.Entry class: represent key, value pairs within HashMap i.e. students
//        // Map.Entry object: has getKey() / getValue() method representing key, value of map item
//        for (Map.Entry<String, Double> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
//        }
//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }
}
