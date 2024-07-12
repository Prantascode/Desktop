import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        myNum.add(32);
        myNum.add(45);
        myNum.add(12);
        myNum.add(8);
        myNum.add(56);

        //Collections.sort(myNum);
        Collections.sort(myNum,Collections.reverseOrder());
        System.out.println(myNum);
    }
}
