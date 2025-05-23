package org.example.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            //This ends up skipping values equal to nums[j]
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
