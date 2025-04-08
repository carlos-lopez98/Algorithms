package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {


    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;


        //We can first check if our start and destination are valid
        if(grid[0][0] != 0 || grid[n - 1][n-1] != 0 ){
            return -1;
        }


        //Get our queue for our BFS - int[] is used to denote a cell
        Queue<int[]> queue = new ArrayDeque<>();

        //We set our first iteration into 1 - as that will be our distance to our start
        grid[0][0] = 1;

        //Then we add our starting cell
        //Remember for BFS we need a start position
        queue.add(new int[]{0,0});


        //This queue part is our BFS part
        while(!queue.isEmpty()){
            int[] cell = queue.remove();

            //We get our cell values
            int row = cell[0];
            int col = cell[1];
            //Distance will be equal to where we're at
            int distance = grid[row][col];

            //In every iteration we check if we've reached our target
            if(row == grid.length - 1 && col == grid[0].length - 1){
                return distance;
            }


            //If not we visit in a BFS manner
            visit(row - 1, col - 1, distance, grid, queue); //top left
            visit(row - 1, col, distance, grid, queue);         //top
            visit(row - 1, col + 1, distance, grid, queue); //top right
            visit(row, col - 1, distance, grid, queue);         //left
            visit(row, col + 1, distance, grid, queue);         // right
            visit(row + 1, col - 1, distance, grid, queue); //bottom left
            visit(row + 1, col, distance, grid, queue);         //bottom
            visit(row + 1, col + 1, distance, grid, queue); //bottom right
        }

        return -1;
    }

        //This visit part is only being used to mark our distances within our cells
        public void visit(int row, int col, int distance, int[][] grid, Queue<int[]> queue){
        int n = grid.length;

        //For our visit we must make sure our row and col are valid
        if(row >= 0 && row < n && col >= 0 && col < n &&
                grid[row][col] == 0){

            //We set our distance equal to distance + 1 - into the grid
            grid[row][col] = distance + 1;

            //Then we add the cell to our queue for BFS
            queue.add(new int[]{row, col});
        }
    }
}
