import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        //cars.set(0,"Mazda");
        //cars.remove(0);
        //cars.clear();
        Collections.sort(cars);
        
        System.out.println(cars/* .get(1)*/);
    }
} 
    

