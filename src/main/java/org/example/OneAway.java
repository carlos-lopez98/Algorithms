package org.example;

/*
*
* There are three types of edits that can be performed on strings: insert a character,
* remove a character, or replace a character. Given two strings, write a function to check if
* they are one edit (or zero edits away)
*
* */

//--Think in functions, try to make segments of your code into private functions
public class OneAway {


    public static boolean algoOne(String one, String two){
        //List what will cause a true result
        //If equal return true
        //If lengths are displaced by more than one return false
        if(Math.abs(one.length() - two.length()) >= 2){
            return false;
        }else if(one.equals(two)){
            return true;
        } else if(one.length() == two.length()){
            int mismatch = 0;

            for(int i = 0; i < one.length(); i++) {
                if(one.charAt(i) != two.charAt(i)){
                    return false;
                }
            }
            return true;
            //Since we have the precondition, this shorter length is only going to be one
        }else if (one.length() < two.length()){
            int mismatch = 0;
            for(int i = 0, j = 0 ; i < two.length(); i++){

                //If we run into a mismatch only the first pointer moves forward
                //We must keep the second pointer at the correct location to do proper
                //comparison
                if(one.charAt(i) == two.charAt(j)){
                    j++;
                }else {
                    mismatch++;
                }

                if(mismatch > 1){
                    return false;
                }
            }
        }else if(one.length() > two.length()){
            int mismatch = 0;
            for(int i =0, j = 0; i < one.length(); i++){

                if(one.charAt(i) == two.charAt(j)){
                    j++;
                }else{
                    mismatch++;
                }

                if(mismatch > 1){
                    return false;
                }
            }
        }

        return true;
    }
}




















 //   public boolean algoOne(String one, String two){
//
//        if(one.equals(two)){
//            return true;
//        }else if(Math.abs(one.length() - two.length()) >= 2){
//            return false;
//        } else if (one.length() == two.length()){
//            int mismatch = 0;
//            for(int i = 0; i < one.length(); i++){
//                if(one.toCharArray()[i] != two.toCharArray()[i]){
//                    mismatch++;
//                }
//                if(mismatch > 1){
//                    return false;
//                }else {
//                    return true;
//                }
//            }
//        }else if(one.length() > two.length()){
//            int mismatch = 0;
//            for(int i = 0; i < two.length(); i++){
//                if(one.toCharArray()[i] != two.toCharArray()[i] || mismatch >= 1){
//                    mismatch++;
//                }
//                if(mismatch > 1){
//                    return false;
//                }else {
//                    return true;
//                }
//            }
//        }else if(one.length() < two.length()){
//            int mismatch = 0;
//            for(int i = 0; i < one.length(); i++){
//                if(one.toCharArray()[i] != two.toCharArray()[i]){
//                    mismatch++;
//                }
//                if(mismatch > 1){
//                    return false;
//                }else {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
