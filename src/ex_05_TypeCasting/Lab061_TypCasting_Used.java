package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    // GST - 18.45
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total_int = course+GST; // Narrowing - Implicit
        int total_int = course+(int)GST; // Narrow - Explicit
        float total = course+GST; // Widenning - implicit
        float total2 = (float) course+GST; // Widenning - Explicit
        System.out.println(total);
    }


}
