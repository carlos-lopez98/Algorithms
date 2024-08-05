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


    //When you use recursion to iterate through something
    //You need a way to keep track of your current iteration
    //Think of each call to it's call stack as an iteration
    //soo you need to know where you're at to appropriately work on the array/ data structure
    public static void iterateArray(int[] nums, int index){
        if(index >= nums.length){
            return;
        }
        //Manipulation logic at whatever index you're at

        System.out.println(nums[index]);
        iterateArray(nums, index + 1);
    }

    //To iterate a string you can do the same thing

    public static void iterateString(String string, int charPosition){

        if(charPosition >= string.length()){
            return;
        }

        //Manipulation logic ath whatever index you're at
        System.out.println(string.charAt(charPosition));

        iterateString(string, charPosition + 1);
    }

    //This ensure the last element is counted
    public static int counter = 1;
    public static int data;

    public static int backTrackCounter (Node head, int kthposition){
        if (head != null && counter == kthposition){
            data = head.data;
        }

        if(head == null){
            return 0;
        }
        backTrackCounter(head.next, kthposition);

        if (counter == kthposition){
            data = head.data;
        }

        counter++;
        return -1;
    }

    public static int backTrack(Node head, int kthPosition) {
        backTrackCounter(head, kthPosition);

        return data;
    }
}
