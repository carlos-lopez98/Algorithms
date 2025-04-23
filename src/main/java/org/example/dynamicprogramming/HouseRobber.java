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
        if (n <= 0) {
            return housesWMoney[0];
        }

        if (n == 1) {
            return Math.max(housesWMoney[0], housesWMoney[1]);
        }

        //If something is already in your cache, you just return that element
        if (cache[n] != -1) {
            return cache[n];
        } else {
            //You either rob the house next door n-1
            //Or you rob the current house + the house to door down
            //You fill in the cache as you go
            cache[n] = Math.max(rob(n - 1), housesWMoney[n] + rob(n - 2));
        }

        //You return the final position in the cache as that will be your answer
        return cache[n];
    }
}
