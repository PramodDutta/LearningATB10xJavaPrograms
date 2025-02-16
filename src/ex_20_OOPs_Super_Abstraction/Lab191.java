package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Pramod d = new Dutta(); // Dynamic Dispatch will Interface
        Dutta d1 = new Dutta(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);

       // Webdriver driver = new ChromeDriver(); // Dynamic Dispatch
    }
}


class Dutta implements Pramod{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Pramod{
    public int a = 10;
    void display();
}
