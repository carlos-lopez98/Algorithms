package org.example.leetcode;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 */

public class ValidParentheses {


    public static boolean isValid(String s){

        Stack<Character> parenthesesStack = new Stack<>();


        if(s.length() % 2 != 0){
            return false;
        }

        char[] string = s.toCharArray();

        for(int i = 0; i < string.length; i++){
            char current = string[i];

            switch(current){
                case '(':
                    parenthesesStack.push(current);
                    break;
                case '[':
                    parenthesesStack.push(current);
                    break;
                case '{':
                    parenthesesStack.push(current);
                    break;
                case ')':
                    if(parenthesesStack.isEmpty()){
                        return false;
                    }

                    if(parenthesesStack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(parenthesesStack.isEmpty()){
                        return false;
                    }

                    if(parenthesesStack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':

                    if(parenthesesStack.isEmpty()){
                        return false;
                    }

                    if(parenthesesStack.pop() != '['){
                        return false;
                    }
                    break;

                default:
                    return false;
            }
        }


        return true;
    }
}
