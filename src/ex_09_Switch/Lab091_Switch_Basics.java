package ex_09_Switch;

import java.util.Scanner;

public class Lab091_Switch_Basics {
    public static void main(String[] args) {

        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number(1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;

        }


    }
}
