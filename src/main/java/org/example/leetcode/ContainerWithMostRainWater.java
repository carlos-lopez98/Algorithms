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

        //Two pointer approach - we move each wall inward with time
        while(leftWall < rightWall){
            //At each iteration we calculate the area
            //To avoid overflow we use math.min for the height
            int h = Math.min(height[leftWall], height[rightWall]);
            int w = Math.abs(rightWall - leftWall);
            int currArea = h * w;

            //We move pointers based on which wall is greater
            //move inward from right if left is greater
            if(height[leftWall] > height[rightWall]){
                rightWall--;
                //move left if rightwall is greater
            }else if (height[leftWall] < height[rightWall]){
                leftWall++;
            }else{
                //If they're equal we can move both this is common in many two pointer scenarios
                leftWall++;
                rightWall--;
            }

            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}
