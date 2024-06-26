public class Animal {
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

public void dispalyInfo(){
    System.out.println("Name = "+name);
    System.out.println("Age = "+age);
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, int age,String breed){
        super(name,age);
        this.breed = breed;
    }
    public void dispalyInfo(){
        super.dispalyInfo();
        System.out.println("Breed = "+breed);
    }
    public void bark(){
        System.out.println("Woof Woof!");
    }
}
class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog("Santu", 2, "Deshi");
        myDog.dispalyInfo();
        myDog.bark();
    }
}