package ex_08_If_Condition;

import java.util.Scanner;

public class Lab088_HackerRank {

    public static void main(String[] args) {

        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // Logic Building - Java (Copyright by Pramod Sir :D )


        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) | data type -> int
        // Output | grade -> data type -> char


        // Step 2. Basic Logic |  Rough Logic
        // if ( score >=90 && score <=100 -> return or print grade  - A
        // else if ( score <=89 && score >=80-> return or print grade  - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,
        //  // else -> grade -> F

        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score!");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("Your Grade is -> " + grade);


        // Step 4: edge cases


    }
}
