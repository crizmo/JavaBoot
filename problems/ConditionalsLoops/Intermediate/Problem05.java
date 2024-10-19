package problems.ConditionalsLoops.Intermediate;

// Calculate Distance Between Two Points

public class Problem05 {
    public static void main(String[] args) {
        int x1 = 2, y1 = 3, x2 = 5, y2 = 6;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
