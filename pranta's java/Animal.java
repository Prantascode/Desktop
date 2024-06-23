public class Animal {
    String name;
    int age;

    public Animal(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public void displayInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
    class Dog extends Animal {
        String breed;
    
        public Dog(String Name, int Age, String Breed) {
            super(Name, Age);
            breed = Breed;
        }
    
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Breed = " + breed);
        }
    
        public void bark() {
            System.out.println("Woof! Woof!");
        }
    }

 class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Shantu", 3, "Deshi");
        myDog.displayInfo();
        myDog.bark();
    }
}

