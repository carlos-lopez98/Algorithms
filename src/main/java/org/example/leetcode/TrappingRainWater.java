package org.example.leetcode;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 *Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 * Constraints:
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 */
public class TrappingRainWater {

    public static int rainCapacity(int[] height){
        //Uses the two pointer technique

        int leftWall = height[0];
        int rightWall = height.length - 1;

        int water = 0;
        int leftMax = -1;
        int rightMax = -1;


        while (leftWall < rightWall){

            if(height[leftWall] <= height[rightWall]){
                if(height[leftWall] > leftMax){
                    leftMax = height[leftWall];
                }else{
                    water += leftMax - height[leftWall];
                }
                leftWall++;
            }else{
                if(height[rightWall] > rightMax){
                    rightMax = height[rightWall];
                }else{
                    water += rightMax - height[rightWall];
                }

                rightWall--;
            }
        }

        return water;
    }
}
