package JavaTutorial.Enum;

enum Laptop{
    Mackbook(2000), XPS(2200), Surface(1500), IPad(1100);

    private int price;

    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        for(Laptop lab : Laptop.values()){
            //Laptop lab =  Laptop.Mackbook;
            System.out.println(lab + " : "+lab.getPrice());
        }
    }
}
