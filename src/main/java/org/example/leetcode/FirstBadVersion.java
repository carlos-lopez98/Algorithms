package org.example.leetcode;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 * Example 1:
 * Input: n = 5, bad = 4
 * Output: 4
 *
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 *
 * Example 2:
 * Input: n = 1, bad = 1
 * Output: 1
 *
 * Constraints:
 * 1 <= bad <= n <= 231 - 1
 */
public class FirstBadVersion {



    //N represents how many versions there are
    //After nth position all future versions will become bad - you are to find the first version in which
    //The bad iterations start
    public int firstBadVersion(int n){
        if(n == 1){
            return n;
        }

        //1,3,4,7,8,11,12

        int left = 0;
        int right = n;

        while(left <= right){
            int midpoint = left + (right - left)/2;

            //Main check here we're able to use midpoint -1 & midpoint +1 because
            //we have a target, so mid is always being checked, don't have to include it
            //It's not a case where mid could still be our answer
            if(isBadVersion(midpoint) && !isBadVersion(midpoint - 1)){
                return midpoint;
            }else if(isBadVersion(midpoint)){
                right = midpoint - 1;
            }else{
                left = midpoint + 1;
            }
        }

        return -1;
    }


    public boolean isBadVersion(int pivot){
        return true;
    }
}
