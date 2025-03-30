package org.example.leetcode;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(curr > max){
                max = curr;
                index = i;
            }
        }

        for(int j = 0; j < nums.length; j++){
            int x = nums[j];
            if(x == max){
                continue;
            }

            if(max < (x *2)){
                return -1;
            }
        }

        return index;
    }
}

// 0 0 2 3
// largest = 0, position = 0
// largest = 0, position = 0
// largest = 2, position 2
// largest = 3, position 3
//totalProduct = 0
