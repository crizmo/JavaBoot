package problems.ConditionalsLoops.Basic;

// Take integer inputs till the user enters 0 and print the largest number from all.

public class Problem05 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        }
        scanner.close();
        System.out.println("Largest number is " + max);
    } 
}
