package org.example.dynamicprogramming;

public class MaximumProductSubarray {


    //Intuitive
    //You basically calculate all prefixProducts
    //Then you calculate all suffixProducts
    //Then set maxProduct equal to math.max of prefix or suffix
    //This works because a suffix will have a third negative
    //While the prefix may not
    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0, j = nums.length - 1; i < nums.length && j>= 0; i++, j--) {
            prefix *= nums[i];
            suffix *= nums[j];

            maxProduct = Math.max(maxProduct, prefix);
            maxProduct = Math.max(maxProduct, suffix);

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }

        return maxProduct;
    }


    public int maxProductDP(int[] nums){
        if (nums.length == 0) return 0;

        int max_so_far = nums[0]; //Local max up to i
        int min_so_far = nums[0]; //Local min up to i
        int result = max_so_far; //Global Max - after comparing max_so_far and min_so_far in every iteration

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int temp_max = Math.max(
                    curr,
                    //This gives us two new potential maxes
                    Math.max(max_so_far * curr, min_so_far * curr)
            );

            min_so_far = Math.min(
                    curr,

                    //This gives us two new potential minimums
                    //notice how we use our old local max - we don't use the new one, as that would cause errors
                    Math.min(max_so_far * curr, min_so_far * curr)
            );

            // Update max_so_far after min_so_far to avoid overwriting it
            max_so_far = temp_max;
            // Update the result with the maximum product found so far
            result = Math.max(max_so_far, result);
        }

        return result;
    }
}
