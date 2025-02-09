package ex_16_Arrays;

import java.util.Scanner;

public class Lab158_2d_Right_Triangles {
    public static void main(String[] args) {


        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }





    }
}
