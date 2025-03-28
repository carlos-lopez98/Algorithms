package org.example.leetcode;

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of
 * bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them
 * instead and will not eat any more bananas during this hour.
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 *
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 *
 * Constraints:
 * 1 <= piles.length <= 104
 * piles.length <= h <= 109
 * 1 <= piles[i] <= 109
 */
public class KokoEatingBananas {

    //h is the hours koko has to eat all her bananas
    //Koko likes taking her sweet time, so she wants to eat exactly enough per hour to take up all the hours
    public static int returnEatingRate(int[] piles, int h){
        int minEatingRate = 1; // Minimum possible rate
        int maxEatingRate = 0; // Max pile size (upper bound)

        // Find the maximum pile size
        for (int pile : piles) {
            maxEatingRate = Math.max(pile, maxEatingRate);
        }
        // Binary search from 1 to maxEatingRate
        //We do less than because we're narrowing our answer to a specific value
        //When we do less than or = to, we will potentially skip the last value if it's not equal to our target
        while (minEatingRate < maxEatingRate) {
            int mid = minEatingRate + (maxEatingRate - minEatingRate) / 2; // Correct mid calculation

            if (willFinishInTime(piles, h, mid)) {
                maxEatingRate = mid; // Try a smaller eating rate to see if a smaller rate can finish in time
                //This is the same as going left
            } else {
                minEatingRate = mid + 1; // Increase the eating rate
            }
        }
        return minEatingRate;
    }

    public static boolean willFinishInTime(int[] piles, int h, int eatingRate){
        int hours = 0;
        for (int bananaPile: piles){
            hours += (int) Math.ceil((double) bananaPile /eatingRate);
        }
        return hours <= h;
    }
}
