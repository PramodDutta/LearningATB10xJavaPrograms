package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";
        int aaaa = 10;

        // String -> Wrapper conversion
        Integer a = Integer.parseInt(num);

        // String to Primitive
        int a3 = Integer.parseInt(num);
        // Integer.max(3,4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

          // a  <Integer.MAX_VALUE


        Integer aa = Integer.valueOf("10");
        System.out.println(aa);


    }
}
