package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 180;

    void notest() {
    }

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }


    void display(){
        System.out.println("Vehicle Parent");
    }

}


// Single Inheritance
class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    void test(){}

    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Overide - Car ");
        System.out.println(super.maxSpeed); //180  - Parent Max
        System.out.println(this.maxSpeed);
        super.notest();
        this.test();

    }
}





