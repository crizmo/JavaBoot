package problems.Basic;

// Take two numbers and print the sum of both.
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
