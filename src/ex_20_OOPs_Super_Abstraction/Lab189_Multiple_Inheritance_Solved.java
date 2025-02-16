package ex_20_OOPs_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.money();
    }
}


class Child1 implements Father1, Mother1{


    @Override
    public void money() {
        System.out.println("Only 1 money");
    }

    @Override
    public void m1() {

    }

    @Override
    public void f1() {

    }
}

interface Mother1{
    void money();
    void m1();
}

interface Father1{
    void money();
    void f1();

    default void ff(){
        System.out.println("This is only allowed!");
    }
}