package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab234_Arraylist_input {
    public static void main(String[] args) {

        // Multiple inputs from the user and store them in separate
        // ArrayLists based on user-defined categories.

        // names, ages - store them

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; // Control variable for input loop

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            names.add(name);


            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            ages.add(age); // Add age to ages list



            scanner.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();


        }



        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }


        scanner.close();




    }
}
