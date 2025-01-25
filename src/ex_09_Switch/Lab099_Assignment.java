package ex_09_Switch;

import java.util.Scanner;


public class Lab099_Assignment {
    public static void main(String[] args) {
        //Please do this assignment program for us
        //CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.

        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Print the collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();


    }
}
