public interface Animal1 {
    void eat();
    void makeSound();
}
abstract class AbstractAnimal1 implements Animal1 {
    protected String name;

    public AbstractAnimal1(String name){
        this.name = name;

   }
   public abstract void move();

}
class Bird extends AbstractAnimal1 {
    public Bird(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is flying");
    }
}
class Mammal extends AbstractAnimal1{
    public Mammal( String name){
    super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is Moving");
    }
}
class Reptile extends AbstractAnimal1 {
    public Reptile(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is moving");
    }
    
}
class Main1 {
    public static void main(String[] args) {
        AbstractAnimal1 mammmal = new Mammal("Lion");
        AbstractAnimal1 bird = new Bird("Eagle");
        AbstractAnimal1 reptile = new Reptile("Cobra");

        AbstractAnimal1[] animals = {mammmal,bird,reptile};

        for(AbstractAnimal1 animal : animals){
            animal.eat();
            animal.makeSound();
            animal.move();
        }
    }
    
}

