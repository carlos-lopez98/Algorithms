package org.example.dynamicprogramming;

public class ClimbingStairs {


    public int climbStairs(int n){

    return dp(n);
    }

    //Takes in the state you want to perform on at every iteration
    //In this case i represents our current step
    //So now we think at every step, what + what gives us our current state?
    private int dp(int i){
        //When we have 1 step - there is only one possible way to get to that step
        if(i == 1){
            return 1;
        }

        //When we have two steps - there are two possible ways to reach this step
        if(i == 2){
            return 2;
        }

        //So at every step your answer is the previous steps path
        //Plus the previous previous step's paths
        return dp(i - 1) + dp (i - 2);
    }
}
