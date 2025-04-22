package org.example.greedy;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        //This algorithm only works if the input arrays are sorted
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = 0;
        int contentChildren = 0;

        //Our bounds
        while(cookieIndex < s.length && contentChildren < g.length){

            //We're iterating from left to right in our cookies
            //If a cookie will satiate one of our children
            //Then we can move our children pointer up
            //As one of our children is satiated
            if(s[cookieIndex] >= g[contentChildren]){
                contentChildren++;
            }

            //If not we just keep trying a larger cookie
            //Since our array is sorted already
            cookieIndex++;
        }

        return contentChildren;
    }
}
