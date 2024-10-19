package problems.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrays {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = new BuildArrays().buildArray(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

