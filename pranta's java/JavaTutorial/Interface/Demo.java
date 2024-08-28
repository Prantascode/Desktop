package JavaTutorial.Interface;


interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code Compile Run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code Compile Run : Faster");
    }
}
class Developer{
    public void DevApp(Computer lab){
        lab.code();
    }
}
public class Demo {
    public static void main(String[] args) {

        Computer lab = new Laptop();
        Computer desk = new Desktop();
        Developer pranta = new Developer();
        pranta.DevApp(lab);
    } 
}
