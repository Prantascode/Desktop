import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> Cpcity = new HashMap<String, String>();

        Cpcity.put("England","London");
        Cpcity.put("Bangladesh", "Dhaka");
        Cpcity.put("India","Deli");
        //Cpcity.remove("England");
        System.out.println(Cpcity);
        System.out.println(Cpcity.keySet());
        System.out.println(Cpcity.values());
        System.out.println(Cpcity.get("Bangladesh"));
    }
}
