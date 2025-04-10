package org.example.dynamicprogramming;

public class ClimbingStairs {

    public int climbStairs(int n){
    return dp(n);
    }

    private int dp(int i){
        if (i <= 0){
            return 0;
        }

        if(i == 1){
            return 1;
        }

        if(i == 2){
            return 2;
        }

        return dp(i - 1) + dp (i - 2);
    }
}
