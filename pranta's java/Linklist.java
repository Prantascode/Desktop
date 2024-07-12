import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");
        //car.addFirst("Lamborghimi");
        car.addLast("Lamborghimi");
        car.removeFirst();
        car.removeLast();
        
        System.out.println(car/*.getLast()*/);
    }
}
