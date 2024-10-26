package problems.Arrays;

import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        Boolean[] result = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return List.of(result);

    }

    public static void main(String[] args) {
        Candies obj = new Candies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(obj.kidsWithCandies(candies, extraCandies));
    }
}
