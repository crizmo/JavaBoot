package problems.Basic;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String input = scanner.next();
            if (input.equals("x")) {
                break;
            }
            sum += Integer.parseInt(input);
        }
        scanner.close();
        System.out.println("Sum: " + sum);
    }
    
}
