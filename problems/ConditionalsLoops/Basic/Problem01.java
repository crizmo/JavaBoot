package problems.ConditionalsLoops.Basic;

// Fibonacci Series In Java Programs

public class Problem01 {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.println("First " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + (i == n ? "\n" : ", "));
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
