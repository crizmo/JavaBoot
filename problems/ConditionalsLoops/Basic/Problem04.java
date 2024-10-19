package problems.ConditionalsLoops.Basic;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class Problem04 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        scanner.close();
        System.out.println("Sum of all numbers is " + sum);
    }
}
