package ex_16_Arrays;

public class Lab154_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }

        for (int i : a) {
            System.out.println(i);
        }

        String[] names = {"pramod", "amit", "lucky", "anil"};

        for (String name : names) {
            System.out.println(name);
        }


    }
}
