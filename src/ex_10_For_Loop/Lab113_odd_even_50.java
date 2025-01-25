package ex_10_For_Loop;

public class Lab113_odd_even_50 {
    public static void main(String[] args) {

        // Shruti - TO find the even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even  -> " + i);
            } else {
                System.out.println("Odd -> " + i);
            }
        }

    }
}
