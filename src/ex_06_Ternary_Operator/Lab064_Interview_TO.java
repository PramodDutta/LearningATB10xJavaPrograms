package ex_06_Ternary_Operator;

public class Lab064_Interview_TO {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);


        int number = 15;
        String result = (number > 10) ? (number > 20? "G > 20": "B 10 to 20") : "B";
        // (number > 20? "G > 20": "B 10 to 20") -> B 10 to 20

        System.out.println(result);






    }
}
