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

    public static int fact(int num){
        if(num == 0){
            return 1;
        }

        return num * fact(num - 1);
    }
}
