package JavaTutorial.Interface;

interface A{
    int age = 50;
    String area = "Bangladesh";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in Show");
    }
    public void config(){
        System.out.println("in Config");
    }
    public void run(){
        System.out.println("Runing...");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        B obj1 = new B();
        obj1.run();
        System.out.println(A.age + " "+A.area);
    }
}
