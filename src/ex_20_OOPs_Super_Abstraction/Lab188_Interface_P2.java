package ex_20_OOPs_Super_Abstraction;

public class Lab188_Interface_P2 {
    public static void main(String[] args) {
        P p = new P();
        p.icm1();
        p.icm2();
    }


}



class P implements I1{

    @Override
    public void icm1() {
        System.out.println(" ICM1 Complete");
    }

    @Override
    public void icm2() {
        System.out.println(" ICM2 Complete");
    }
}


interface I1{
    void icm1();
    void icm2();
}
interface I2{
    void icm3();
}