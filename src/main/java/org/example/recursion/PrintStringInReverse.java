package org.example.recursion;

public class PrintStringInReverse {

    public void printInReverse(String s){
        reverse(0 , s);
    }

    public void reverse(int index, String s){
        if(index >= s.length()){
            return;
        }

        //This will just basically traverse the whole string
        //Then on the pops back, we'd want it to print out the current stack
        reverse(index + 1, s);

        System.out.print(s.charAt(index) + " ");
    }


}
