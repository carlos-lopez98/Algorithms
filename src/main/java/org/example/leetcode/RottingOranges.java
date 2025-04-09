package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    int[][] directions = {{-1,0}, {0,-1}, {1,0}, {0,1}};

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int freshOranges = 0;

        //Extra we can perform this at the end - and just check for fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }


        //Add all starting rotten oranges to your queue
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
            //This queue.size() is a key to this madness
            //Allows you to perform breadth traversal on multiple locations at the same time
            int size = queue.size();

            //Return first rotten orange in queue
            for (int i = 0; i < size; i++) {
                //This is just a way to get the cell position
                int num = queue.poll(), row = num / n, col = num % n;

                //Let's use the directions to iterate through each neighbor
                for(int[] direction: directions){
                    int x  = direction[0] + row, y = direction[1] + col;
                    if(x > -1 && y > -1 && x < m && y < n && grid[x][y] == 1){
                        //Adds the cells on each side to the queue
                        queue.add(x * n + y);
                        freshOranges--;
                        grid[x][y] = 2;
                    }
                }
            }
            //After each while queue.size() iteration - we add one to minutes
            minutes++;
        }

        //Then we lastly check if any fresh oranges are left - we can do this in another for loop
        //Then we don't have to keep track of freshOranges as a variable
        return freshOranges == 0 ? minutes : -1;
    }
}
