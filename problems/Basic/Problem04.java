package problems.Basic;
// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf);

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    public static int findHCF(int num1, int num2) {
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) { // HCF can't be greater than the smaller number
            if (num1 % i == 0 && num2 % i == 0) { // If i divides both numbers then it is a common factor
                hcf = i;
            }
        }
        return hcf;
    }

    public static int findLCM(int num1, int num2, int hcf) {
        return (num1 * num2) / hcf;
    }
    
}
