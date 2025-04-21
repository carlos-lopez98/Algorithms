package org.example.dynamicprogramming;

import java.util.Arrays;

public class CoinChangeProb {

    public int coinChange(int[] coins, int amount){
        if(amount <= 0 ) return 0;


        int[] dp = new int[amount +1];

        int max = amount + 1;

        Arrays.fill(dp, max);

        dp[0] = 0;


        for(int i = 0; i < dp.length; i++){
            for(int coin: coins){
             if(coin > i){
                 continue;
             }

             dp[i] = Math.min(dp[i], 1 + dp[i - coin]);

            }
        }

        return (dp[amount] != max) ? dp[amount] : -1;
    }
}
