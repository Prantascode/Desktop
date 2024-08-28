package JavaTutorial.Calculator;

public class DemoCalc {
    public static void main(String[] args) {
        
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 6);
        int r2 = obj.sub(7 ,3);
        int r3 = obj.multi(3,5);
        int r4 = obj.divi(6, 3);
        double r5 = obj.power(5, 3);

        System.out.println(r1 + " " + r2 +" "+r3+ " "+r4+ " "+r5);
    }
}
 