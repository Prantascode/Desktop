package JavaTutorial;

import java.util.Scanner;

public class CalculateLine {

    public static void main(String[] args) {
        int m;
        int b;
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("This program calculates y coordinates for a line.");

        System.out.print("Enter slope (m): ");
         m = sc.nextInt();

        System.out.print("Enter intercept (b): ");
        b = sc.nextInt();

        while (true) {
            
            System.out.print("Enter x: ");
            x = sc.nextInt();
            
            if (x == -1) {
                break;
            }

            int y = (m * x + b);
            System.out.println("f(" + x + ") = " + y);
        }
    }
}
