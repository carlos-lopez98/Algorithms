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

            //In every iteration we reset distance = to the new spot we hopped to
            //That means at every position we must set the next value we're traversing to
            //to distance + 1, so if we're 4 spaces into the path, our next space we hop to will be 5
            int distance = grid[row][col];

            //If we're at our target - return the distance to target
            if(row == grid.length - 1 && col == grid[0].length - 1){
                return distance;
            }

            visit(row - 1, col - 1, distance, grid, queue); //top left
            visit(row - 1, col, distance, grid, queue);         //top
            visit(row - 1, col + 1, distance, grid, queue); //top right
            visit(row, col - 1, distance, grid, queue);         //left
            visit(row, col + 1, distance, grid, queue);         // right
            visit(row + 1, col - 1, distance, grid, queue); //bottom left
            visit(row + 1, col, distance, grid, queue);         //bottom
            visit(row + 1, col + 1, distance, grid, queue); //bottom right
        }

        //This will only happen if we don't find a vianble path
        return -1;
    }

    //For your visit function
    //You're just checking whether or not to add a new cell to your queue
    //Then changing the number at that cell to your distance traveled
    public void visit(int row, int col, int distance, int[][] grid, Queue<int[]> queue){
        int n = grid.length;

        if(row >= 0 && row < n && col >= 0 && col < n &&
                grid[row][col] == 0){

            grid[row][col] = distance + 1;
            queue.add(new int[]{row, col});
        }
    }
}
