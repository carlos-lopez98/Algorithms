package org.example.leetcode;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
making four. The same principle applies to the number nine, which is written as IX.

There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
 */


import java.util.HashMap;

//For this one, we must pay attention to how the Roman Numeral is written
//They are usually written from largest value to smallest, so you won't see any smaller values before the larger ones
//Unless it's following one of the three rules from the above
public class RomanToInteger {

    //First we must map our values to the Symbol
    public static HashMap<Character, Integer> romanToIntMap = new HashMap<Character, Integer>();



    public static int romToInt(String romans){

        romanToIntMap.put('I',1);
        romanToIntMap.put('V',5);
        romanToIntMap.put('X',10);
        romanToIntMap.put('L',50);
        romanToIntMap.put('C',100);
        romanToIntMap.put('D',500);
        romanToIntMap.put('M',1000);


        int result = 0;

        for(int i = 0; i < romans.length(); i++){
            int value = romanToIntMap.get(romans.charAt(i));
            int nextValue = romanToIntMap.get(romans.charAt(i+1));

            if(value < nextValue){
                result -= value;
            }else{
                result += value;
            }
        }

        return result;
    }
}

