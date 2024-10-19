package problems.ConditionalsLoops.Intermediate;

// Calculate Discount Of Product

public class Problem04 {
    public static void main(String[] args) {
        double price = 1000;
        double discount = 0;
        if (price < 1000) {
            discount = 0;
        } else if (price >= 1000 && price < 2000) {
            discount = 10;
        } else if (price >= 2000 && price < 3000) {
            discount = 20;
        } else {
            discount = 30;
        }
        System.out.println("Discount: " + discount + "%");
    }
}
