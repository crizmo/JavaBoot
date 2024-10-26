package problems.Arrays;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class CurrentSmaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                System.out.println("Nums[i]: " + nums[i] + " Nums[j]: " + nums[j]);
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        CurrentSmaller obj = new CurrentSmaller();
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = obj.smallerNumbersThanCurrent(nums);
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}