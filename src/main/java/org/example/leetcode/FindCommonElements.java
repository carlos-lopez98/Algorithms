package org.example.leetcode;


import java.util.ArrayList;
import java.util.List;

/*
*
* Find the common elements in three sorted arrays
*
* Input:
* ar1[] = {1, 5, 10, 20, 40, 80}
* ar2[] = {6, 7, 20, 80, 100}
* ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
*
* Output: 20, 80
* */
public class FindCommonElements {
    //You can brute force this, just iterate through each one
    //If you find a common element save it, go to the next iteration and so forth

    //Better method would be to have three pointers - one for each list
    //This only works because the arrays are in ascending order
    //So if a value is less than the other two, you can move the current pointer forward
    //For it's corresponding list
    public void algoOne(int[] arrOne, int[] arrTwo, int[] arrThree){

        int pointerOne = 0;
        int pointerTwo = 0;
        int pointerThree = 0;

        List<Integer> match = new ArrayList<Integer>();

        while(pointerOne < arrOne.length && pointerTwo < arrTwo.length && pointerThree < arrThree.length){

            int currOne = arrOne[pointerOne];
            int currTwo = arrTwo[pointerTwo];
            int currThree = arrThree[pointerThree];

            if(currOne == currTwo && currTwo == currThree){
                match.add(currOne);

            }

            if(currOne <= currTwo && currOne <= currThree){
                pointerOne++;
            }else if(currTwo <= currOne && currTwo <= currThree){
                pointerTwo++;
            }else {
                pointerThree++;
            }
        }


        if(!match.isEmpty()){
            for(Integer curr: match){
                System.out.print(curr + " ");
            }
        }else{
            System.out.println("No Matching Integers in List");
        }
    }
}
