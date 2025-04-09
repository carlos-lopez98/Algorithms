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
}
