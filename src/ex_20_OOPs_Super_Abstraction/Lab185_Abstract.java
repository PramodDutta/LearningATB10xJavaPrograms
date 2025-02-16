package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        Child c  = new Child();
        c.loan50k();
        c.loan25k();

        //Father f1 = new Father(); // Abstract classes don't have any object.
    }
}





// abstract class -
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 20K");
    }
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan!");
    }
}