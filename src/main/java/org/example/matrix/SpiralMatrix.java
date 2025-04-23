package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int VISITED = 101;
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] directions = {
                { 0, 1},
                { 1, 0},
                { 0, -1},
                { -1, 0}
        };


        int currentDirection = 0;
        int changeDirection = 0;


        int row = 0;
        int col = 0;

        List<Integer> result = new ArrayList<>();
        result.add(matrix[0][0]);

        //We can mark visited with a large number that the grid won't have
        //in this case it's 101
        matrix[0][0] = VISITED;

        while (changeDirection < 2) {

            while (
                            //current direction is a number 0 - 3
                            //It represents the row we're currently on - or the direction technically
                            //row 0 = right
                            //row 1 = down
                            //row 2 = left
                            //row 3 = up
                            row + directions[currentDirection][0] >= 0 &&
                            row + directions[currentDirection][0] < rows &&
                            col + directions[currentDirection][1] >= 0 &&
                            col + directions[currentDirection][1] < columns &&

                            matrix[row + directions[currentDirection][0]][col +
                                    directions[currentDirection][1]] !=
                                    VISITED
            ) {

                //While we're inbounds we're not changing direction
                changeDirection = 0;

                //We move forward - then mark that position as visited
                row = row + directions[currentDirection][0];
                col = col + directions[currentDirection][1];
                result.add(matrix[row][col]);
                matrix[row][col] = VISITED;

            }


            //Our direction changes when we hit another visited or a bound
            currentDirection = (currentDirection + 1) % 4;
            //Our direction changes - if this is ever more than 1, then we know we've hit our last point
            changeDirection++;
        }

        return result;
    }
}
