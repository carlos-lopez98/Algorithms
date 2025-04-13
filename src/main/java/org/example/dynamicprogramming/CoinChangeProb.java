package org.example.dynamicprogramming;

public class CoinChangeProb {

    public int coinChange(int[] coins, int amount){
        if(amount < 0){
            return -1;
        }

        if(amount == 0){
            return 0;
        }

        int localMin = Integer.MAX_VALUE;

        for(int coin : coins){
            int remainingAmount = coinChange(coins, amount - coin);

            if(remainingAmount >= 0 ){
                localMin = Math.min(localMin, remainingAmount + 1);
            }

        }

        return localMin;
    }

}
