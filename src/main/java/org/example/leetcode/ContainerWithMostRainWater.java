package org.example.leetcode;

/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Constraints:
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */

public class ContainerWithMostRainWater {

    //Input array is an array of multiple heights
    public static int mostRainWater(int[] height){
        int leftWall = 0;
        int rightWall = height.length -1;
        int maxArea = 0;
        while(leftWall < rightWall){
            int h = Math.min(height[leftWall], height[rightWall]);
            int w = Math.abs(rightWall - leftWall);
            int currArea = h * w;
            if(height[leftWall] > height[rightWall]){
                rightWall--;
            }else if (height[leftWall] < height[rightWall]){
                leftWall++;
            }else{
                leftWall++;
                rightWall--;
            }
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}
