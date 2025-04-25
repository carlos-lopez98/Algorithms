package org.example.dynamicprogramming;

import java.util.Arrays;

public class HouseRobber {

    int[] housesWMoney;
    int[] cache;

    public HouseRobber(int[] nums) {
        this.housesWMoney = nums;
        this.cache = new int[nums.length];

        //Instantiate cache to -1
        Arrays.fill(cache, -1);
    }

    public int rob(int n) {

        //Base cases
        if (n <= 0) {
            return housesWMoney[0];
        }
        if (n == 1) {
            return Math.max(housesWMoney[0], housesWMoney[1]);
        }

        if (cache[n] != -1) {
            return cache[n];
        } else {

            //Recurrence relation is you either rob the next house or the current and one skipped
            cache[n] = Math.max(rob(n - 1), housesWMoney[n] + rob(n - 2));
        }

        //You're cache will fill in from top down, so your nth position will be the position to return
        return cache[n];
    }
}
