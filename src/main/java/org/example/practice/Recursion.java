package org.example.practice;

/*
*
* Recursion practice
*
* */
public class Recursion {
    //TODO Practice
    //Print Countdown
    //Print Upcount
    //Implement Recursive Factorial
    //



    public static int fact(int x){
        if(x == 0){
            return 1;
        }

        return x * fact(x-1);
    }
}
