package JavaTutorial.AbtractMethod;

abstract class Car{
    public abstract void drive();
    public abstract void fly();


    public void playMusic(){
        System.out.println("Music Playing");
    }
}
abstract class BMW extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}
class newBMW extends BMW  //concrete class
{

    public void fly(){
        System.out.println("Flying");
    }
}

public class Demo {
    public static void main(String[] args) {
        BMW obj = new newBMW();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
