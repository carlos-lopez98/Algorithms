/*
* Given an array nums containing n distinct numbers in the range [0, n],
* return the only number in the range that is missing from the array.
*/

import java.util.Arrays;

public class MissingNumber {


    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i =0; i < nums.length - 1; i++){
            int temp = nums[i + 1];

            if (temp != nums[i] + 1){
                return nums[i] + 1;
            };
        }

        return nums.length;
    }
}
