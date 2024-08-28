package JavaTutorial.InnerClass;

class A{
    int age;
    public void Show(){
        System.out.println("In show");
    }
    static class B{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.Show();
        A.B obj1 =new A.B();
        obj1.config();
    }
}
