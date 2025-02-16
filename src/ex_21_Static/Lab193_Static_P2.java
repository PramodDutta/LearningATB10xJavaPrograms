package ex_21_Static;

public class Lab193_Static_P2 {

    public static void main(String[] args) {
        ATB umesh = new ATB(987654321,"Umesh");
        ATB anubha = new ATB(987654387,"Anumba");
        System.out.println(umesh.phone_np);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.m1();
        // Primitve Var java is not 100% OOpS - int, byte, short, long, float
        // Object ->
    }

}

class ATB{
    static String course_name = "ATB";
    int phone_np;
    String name;

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void m1(){
        System.out.println("Mark Attedance");
    }
}
