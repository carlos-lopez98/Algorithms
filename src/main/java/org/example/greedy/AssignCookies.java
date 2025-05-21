package org.example.greedy;

import java.util.Arrays;


//The key here is to pick the array that you can continously walk through
//In this case it's the cookies, once you have more contentChildren then children available
//You can just return the content children
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;

        for(int i = 0; i < s.length; i++) {
            if (contentChildren >= g.length) {
                break;
            }

            if (s[i] >= g[contentChildren]) {
                contentChildren++;
            }
        }

        return contentChildren;
    }
}
