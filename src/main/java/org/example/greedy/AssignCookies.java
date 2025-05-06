package org.example.greedy;

import java.util.Arrays;

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
