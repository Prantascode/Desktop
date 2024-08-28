package JavaTutorial.UpDownCasting;


class A{
    public void show1(){
        System.out.println("Show A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("show B");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}
