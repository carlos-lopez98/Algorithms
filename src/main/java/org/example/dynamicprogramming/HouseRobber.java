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
        //Base Case
        if (n <= 0) {
            return housesWMoney[0];
        }

        if (n == 1) {
            return Math.max(housesWMoney[0], housesWMoney[1]);
        }

        //To cache - you need to recurse in on the cache
        // This sets up every value in your cache
        if (cache[n] != -1) {
            return cache[n];
        } else {
            cache[n] = Math.max(rob(n - 1), housesWMoney[n] + rob(n - 2));
        }

        return cache[n];
    }
}
