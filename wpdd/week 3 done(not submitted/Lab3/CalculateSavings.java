package testing;

import java.util.Scanner;

public class CalculateSavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = scanner.nextDouble();

        double savings = pay * 0.10;

        System.out.println("Your savings (10% of your pay) is: $" + savings);

  
    }
}
