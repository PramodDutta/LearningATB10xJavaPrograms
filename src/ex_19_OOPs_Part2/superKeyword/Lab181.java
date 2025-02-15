package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}

class Father {
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son() {
        super();
    }

    void t1() {
        super.home();
        System.out.println(super.gold);
    }
}