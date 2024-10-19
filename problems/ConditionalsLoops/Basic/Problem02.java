package problems.ConditionalsLoops.Basic;

// Subtract the Product and Sum of Digits of an Integer

public class Problem02 {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            System.out.println("Digit: " + digit);
            sum += digit;
            product *= digit;
            n /= 10;
        }
        System.out.println("Difference between the product and sum of digits of " + n + " is " + (product - sum));
    }
}
