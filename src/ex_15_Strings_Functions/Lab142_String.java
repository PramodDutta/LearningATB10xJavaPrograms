package ex_15_Strings_Functions;

public class Lab142_String {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
       // Creates a new string "Hello World!"
        System.out.println(s3);
        System.out.println(s1.concat(s2));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);

        // StringBuffer , StringBuilder - 2 more ways to create strings.




    }
}
