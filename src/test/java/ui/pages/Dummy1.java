package ui.pages;

public class Dummy1 implements Dummy2 {


    public static void a(){

    }


    static int k=11;
    int z;

    public Dummy1() {
        System.out.println(k);
    }
    public void yeni(){
        System.out.println(z);
        k=15;
        System.out.println(k);
    }

    public void yeni1(){
        System.out.println(k);
    }

    public static void main(String[] args) {
        Dummy1 obj=new Dummy1();
        Dummy1 obj1=new Dummy1();
        System.out.println(k);
        obj.yeni();
        obj.yeni1();
        obj1.yeni1();

    }

    @Override
    public void y() {

    }
}
