package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
 * The result should also be sorted in ascending order.
 *
 * An integer a is closer to x than an integer b if:
 *
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 *
 * Example 1:
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 *
 * Example 2:
 * Input: arr = [1,1,2,3,4,5], k = 4, x = -1
 * Output: [1,1,2,3]
 *
 * Constraints:
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 * arr is sorted in ascending order.
 * -104 <= arr[i], x <= 104
 */
public class FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x){

        List<Integer> ans = new ArrayList<>();

        if(k == arr.length){
            return Arrays.stream(arr).boxed().collect(Collectors.toList());
        }

        int left = 0;
        int right = arr.length - k;

        //Using left < right
        //Makes it to where both our right pointer and left pointer are viable starting positions
        while(left < right){
            int midpoint = left + (right - left)/2;


            if(x - arr[midpoint] > arr[midpoint + k] - x ){
               left = midpoint + 1;
            }else {
                right = midpoint;
            }
        }

        //Once you find the start to your range - then just iterate up to k return those elements
        for(int i = left; i < left + k; i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}
