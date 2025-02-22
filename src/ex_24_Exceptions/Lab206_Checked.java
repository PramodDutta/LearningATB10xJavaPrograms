package ex_24_Exceptions;

import java.io.FileInputStream;

public class Lab206_Checked {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            //e.printStackTrace(); // This means full problem details with line no.
            //System.out.println(e.getMessage()); // / by zero
            System.out.println("Own message!");
        }
        System.out.println("2");


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.


       // FileInputStream fileInputStream = new FileInputStream("C://log.txt");



    }
}
