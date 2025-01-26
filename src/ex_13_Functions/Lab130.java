package ex_13_Functions;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Enter only int ");
            System.exit(0);
        }
        System.out.println("Enter the num 2");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Enter only int ");
            System.exit(0);
        }
        int result = sum(a, b);
        System.out.println(result);
    }

    public static int sum(int i, int i1) {
        return i + i1;
    }
}
