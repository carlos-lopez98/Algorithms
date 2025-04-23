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

            if(s[cookieIndex] >= g[contentChildren]){
                contentChildren++;
            }

            //We try a larger cookie regardless if a child takes it or not
            cookieIndex++;
        }

        return contentChildren;
    }
}
