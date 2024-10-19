package problems.ConditionalsLoops.Intermediate;

// Calculate Average Of N Numbers, take input n from user
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += input.nextDouble();
        }
        System.out.println("Average: " + sum / n);
        input.close();
    }
}
