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


    //5 * 4 * 3 * 2 * 1
    public static int fact(int num){
        System.out.println("The number is " + num);

        if(num == 0){
            return 1;
        }

        System.out.println("The number is " + num);

        return num * fact(num - 1);
    }


    public static void countDown(int num){

        System.out.println(num);

        if(num == 0){
            return;
        }


        countDown(num - 1);
    }

    public static void countUp(int num){

        if(num == 11){
            return;
        }


        System.out.println(num);
        countUp(num + 1);
    }


    public static void iterateArray(int[] nums, int index){

        if(index >= nums.length){
            return;
        }

        System.out.println(nums[index]);

        iterateArray(nums, index + 1);
    }

}
