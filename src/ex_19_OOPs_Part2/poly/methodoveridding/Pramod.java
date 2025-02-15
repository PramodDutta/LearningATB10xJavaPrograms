package ex_19_OOPs_Part2.poly.methodoveridding;

public class Pramod extends Father{

    @Override
    void home(){
        System.out.println("pramod - 3BHK");
    }

    void p1(){
        System.out.println("pramod - p1");
    }
}
