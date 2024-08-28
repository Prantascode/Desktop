class Demo {
    public int add(int r1,int r2){
        return r1+r2;
    }
}
public class Calculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        Demo myobj = new Demo();
        int rl = myobj.add(num1, num2);
        System.out.println(rl);
    }
}
