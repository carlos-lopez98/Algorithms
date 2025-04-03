package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    //When working with an nxn matrix
    //You can choose to make an alternate matrix
    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;

        //Basically if top left corner and bottom left corner aren't open
        //Then automatically return -1, since we don't technically have a source or destination
        if(grid[0][0] != 0 || grid[n - 1][n-1] != 0 ){
            return -1;
        }

        //Use ArrayDequeue, when working with BFS
        //And when you don't need list functionality or don't need to handle null cases
        Queue<int[]> queue = new ArrayDeque<>();

        //We're basically marking visited nodes as 1, so we don't touch them again
        //This also lets us add the distance, so if it becomes one our distance is now distance += this next spot
        //we're traversing into
        grid[0][0] = 1;

        //Remember that an n x n matrix is basically an int[] n by an int[] n
        queue.add(new int[]{0,0});


        //Now we can start our BFS like normal
        while(!queue.isEmpty()){
            int[] cell = queue.remove();
            int row = cell[0];
            int col = cell[1];

            //Value becomes our distance - for first iteration
            int distance = grid[row][col];

            //If we're at our target - return the distance to target
            if(row == grid.length - 1 && col == grid[0].length - 1){
                return distance;
            }
        }

    }


    public int BFS()
}
