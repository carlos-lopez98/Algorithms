package org.example;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */


//For some problems you have to think mathematically to get to the optimal solution
//You can solve this one by converting the number to a string, and then iterating through it
//How would you solve it if you couldn't iterate through it? This is where the mathematical thinking comes in
public class PalindromeNumber {



//Since we cannot simply convert this to a string we must use math
public boolean isPalindrome(int x){

    int result = 0;
    int temp = x;


    while (temp >= 1){

        //When performing the modulus on a single digit number
        //You get the number by itself
        int lastDigit = temp % 10;

        //This effectively reverses the original number
        result = (result*10) + lastDigit;
        temp = temp/ 10;
    }

    if(result == x){
        return true;
    }

 return false;
}
}
