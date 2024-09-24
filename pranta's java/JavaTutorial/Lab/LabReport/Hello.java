package JavaTutorial.Lab.LabReport;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            
            numbers[i] = sc.nextInt();
        }
        
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        
        double aver = sum / 5.0;

        System.out.println("Sum: " +sum);
        System.out.println("Average value: " + aver);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
    }
}

