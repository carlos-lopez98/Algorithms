package org.example.greedy;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        //We must sort so we can try to give the smallest cookie to the smallest
        //greed child
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = 0;
        int contentChildren = 0;

        //Our bounds
        while(cookieIndex < s.length && contentChildren < g.length){

            //If our cookiew can satsify our child - then we have a content child
            //Try the next child
            if(s[cookieIndex] >= g[contentChildren]){
                contentChildren++;
            }

            //If not we just keep trying a bigger cookie
            //Only works because we sorted both arrays to start with
            cookieIndex++;
        }

        return contentChildren;
    }
}
