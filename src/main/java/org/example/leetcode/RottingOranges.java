package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    int[][] directions = {{-1,0}, {0,-1}, {1,0}, {0,1}};

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int freshOranges = 0;

        //We technically don't need this fresh oranges variable - we can just iterate through the grid again
        //And see if we have any fresh oranges left
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }


        //Once you understand the problem well
        //You'll realize that this is a multi-start BFS, you need to find all the rotten oranges
        //Then start BFS through each one
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(i * n + j);
                }
            }
        }


        int minutes = 0;


        while (!queue.isEmpty() && freshOranges > 0) {

            //The size denotes basically each time we need to increase minutes
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                //this row = num/n is just a way of storing row and col into a single integer
                int num = queue.poll(), row = num / n, col = num % n;

                for(int[] direction: directions){
                    int x  = direction[0] + row, y = direction[1] + col;
                    if(x > -1 && y > -1 && x < m && y < n && grid[x][y] == 1){
                        queue.add(x * n + y);
                        freshOranges--;
                        grid[x][y] = 2;
                    }
                }
            }

            //We always increase our minutes after making it through each .size()
            minutes++;
        }

        return freshOranges == 0 ? minutes : -1;
    }
}
