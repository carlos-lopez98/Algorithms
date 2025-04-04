package org.example.dynamicprogramming;

public class UniquePaths {

    //Find the number of unique paths from top left to bottom right
    public int uniquePathsRecursive(int m, int n){
        if(m == 1 & n == 1) return 1; // 1 by one grid = 1 spot
        if(m == 0 || n == 0) return 0; //not a valid grid

        return uniquePathsRecursive(m - 1, n) + uniquePathsRecursive(m, n - 1);
    }
}
