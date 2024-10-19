package problems.ConditionalsLoops.Basic;

// Input a number and print all the factors of that number (use loops).

public class Problem03 {
    public static void main(String[] args) {
        int n = 60;
        System.out.println("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + (i == n ? "\n" : ", "));
            }
        }
    }
}
