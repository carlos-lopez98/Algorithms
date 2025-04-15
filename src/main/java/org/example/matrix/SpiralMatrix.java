package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int VISITED = 101;
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Four directions that we will move: right, down, left, up.
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        //Current Direction
        //0 represents right
        //1 represents down
        //2 represents left
        //3 represents up
        //Since we're spiraling, we know we must go right, down, left, up
        //So we're able to use the index = (index + 1) % N trick
        int currentDirection = 0;

        // The number of times we change the direction.
        //This is used to track when we hit the end
        int changeDirection = 0;

        // Current place that we are at is (row, col).
        // row is the row index; col is the column index.
        int row = 0;
        int col = 0;

        // Store the first element and mark it as visited.
        List<Integer> result = new ArrayList<>();
        result.add(matrix[0][0]);

        //We're setting visited grids to 101 so we don't have to have a separate
        //2D array copying cells over, instead if the cell == 101 then we know we've visited it
        matrix[0][0] = VISITED;

        //While we're not at the end
        while (changeDirection < 2) {


            while (
                            //While inbounds
                            row + directions[currentDirection][0] >= 0 &&
                            row + directions[currentDirection][0] < rows &&
                            col + directions[currentDirection][1] >= 0 &&
                            col + directions[currentDirection][1] < columns &&

                            //And the next direction is not visited
                            matrix[row + directions[currentDirection][0]][col +
                                    directions[currentDirection][1]] !=
                                    VISITED
            ) {
                //while the above is true, that means we're not changing direction
                //We're in a spot in the matrix where we're going straight
                changeDirection = 0;


                //Then update the next spot we're moving to to 101
                //And add that spot to our return list
                row = row + directions[currentDirection][0];
                col = col + directions[currentDirection][1];
                result.add(matrix[row][col]);
                matrix[row][col] = VISITED;
            }
            //Once we're out of the while loop - it means we've hit a bound
            //Or hit a visited cell
            //So we
            // Change our direction.
            currentDirection = (currentDirection + 1) % 4;

            // Increment change_direction because we changed our direction.
            //And we increment our change direction counter
            //If we break out of the above while - means we've hit another wall
            //Which means we're at the end - so the outer while breaks out and
            //We can return our list
            changeDirection++;
        }

        return result;
    }
}
