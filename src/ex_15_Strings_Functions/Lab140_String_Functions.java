package ex_15_Strings_Functions;

public class Lab140_String_Functions {
    public static void main(String[] args) {

        String str1 = "Hello"; // SCP, OA ? ->   // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";
        String str3 = new String("Hello"); //Creates a new object on the heap

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3)); //true, because the content is the same






    }
}
