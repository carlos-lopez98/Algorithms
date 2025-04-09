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

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }

        return maxProduct;
    }


    public int maxProductDP(int[] nums){
        if (nums.length == 0) return 0;

        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int temp_max = Math.max(
                    curr,
                    Math.max(max_so_far * curr, min_so_far * curr)
            );
            min_so_far = Math.min(
                    curr,
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
