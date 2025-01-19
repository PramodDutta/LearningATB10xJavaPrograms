package ex_07_Increment_Decrement_Op;

public class Lab069_In_de_op {
    public static void main(String[] args) {
        // Take inputs
        String age_string = args[0]; // 99
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // 101
        System.out.println(args[3]); // 56
//        System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException
        // 99 100 101 56

        String canIGoGoa =  age >= 24 ? "Yes" : "No";
        System.out.println(canIGoGoa);
    }
}
