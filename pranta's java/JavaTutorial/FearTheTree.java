package JavaTutorial;
import java.util.Scanner;
public class FearTheTree {

   // public class Receipt2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of feet: ");
            int feet = sc.nextInt();
            System.out.print("Enter number of inches: ");
            int inche = sc.nextInt();
            double newFeet = feet*30.48;
            double newInch = inche*2.54;
            double cm = newFeet + newInch;
            System.out.println(feet+"ft"+" "+inche+"in"+" = "+cm+"cm");

        }
    }
