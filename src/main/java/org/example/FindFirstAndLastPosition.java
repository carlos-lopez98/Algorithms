package org.example;


/*
 *
 * Given an array of integers nums sorted in ascending order, find the starting and ending position
 * of a given target value
 *
 * If target is not found in the array, return [-1, -1]
 *
 * */

public class FindFirstAndLastPosition {


    //To acheive O(log n) you need to do binary search
    //This will get you to the target element
    //But how do you get the first occurrence, you'll run binary search on the left side of the target
    //Then you'll run the search again, but this time on the right side of the target
    public int[] indexes(long[] v, long x) {

        int[] result = new int[]{-1,-1};

        int mid;
        int left = 0;
        int right= v.length - 1;

        while (left <= right){
            mid = (left + right)/ 2;
            //We found target, so we will now search on left side to find first occurrence
            if(v[mid] == x){
                result[0] = mid;
                right = mid -1;
            }else if (v[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        left = 0;
        right = v.length - 1;
        mid = 0;

        while(left <= right){
            mid = (left + right)/ 2;
            //We found target, so we will now search on left side to find first occurrence
            if(v[mid] == x){
                result[1] = mid;
                left = mid  + 1;
            }else if (v[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return result;
    }
}
