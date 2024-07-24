package org.example;

/*
* Write a method to replace all spaces in a string with "%20"
* The input string will be a character array - in order to be able to do this in place
* --see page 90--
*
* Input: String[] with additional space characters to accomodate the %20 needed
*           True length of the string "I am dog   ", 8 (True length till end of Dog)
* */

//Clarifying Questions:
//What does true length mean exactly?
//Will the actual length of the string be greater than the number of spaces needed to do the in place swaps?
public class URLify {

    //Assumes the full length may include spaces we don't need and true length is just up until the end of
    //the string we want changed --"Here we are" True Length not "Here we are   "
    public static String algoOne(char[] args, int trueLength){
        int whitespaces = 0;

        //Count whitespaces first to get our position for our second pointer
        for(int i = 0; i < trueLength; i++){
            if(args[i] == ' '){
                whitespaces++;
            }
        }

        //Now that we know the whitespace count we can successfully see where our second pointer should start

        int secondPointer = trueLength + whitespaces*2;

        for(int j = trueLength - 1; j >= 0; j--){

            if(args[j] == ' '){
                args[secondPointer - 1] = '0';
                args[secondPointer - 2] = '2';
                args[secondPointer - 3] = '%';

                secondPointer -= 3;
            }else{
                args[secondPointer-1] = args[j];
                secondPointer--;
            }
        }


        return new String(args);
    }
}
