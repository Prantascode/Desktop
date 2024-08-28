package JavaTutorial.Interface.FactionalInterface;

@FunctionalInterface
interface A{
    int add(int i , int j);
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A(){
            public int add(int i, int j){
                return i+j;
            }
        } ;
        int  rslt = obj.add(5, 4);
        System.out.println(rslt);
        
    }
}
