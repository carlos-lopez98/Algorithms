package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //We decided to go with a visited number
        //When we visit a cell we update it's value with 101 - so we know this now acts as a boundary
        int VISITED = 101;
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };


        //This is the starting direction - since we're going clockwise - it's right
        int currentDirection = 0;

        //This acts as our stopper - if we attempt to change directions more than once, we've hit our last element
        int changeDirection = 0;


        int row = 0;
        int col = 0;

        //Result
        List<Integer> result = new ArrayList<>();
        //Add our first element to the result
        result.add(matrix[0][0]);
        //Then mark first element as visited
        matrix[0][0] = VISITED;

        //While we're not at our last position - we can still attempt more movement
        while (changeDirection < 2) {

            while (
                            //If we're in bounds - we keep going in the same direction
                            row + directions[currentDirection][0] >= 0 &&
                            row + directions[currentDirection][0] < rows &&
                            col + directions[currentDirection][1] >= 0 &&
                            col + directions[currentDirection][1] < columns &&

                            //If we hit a visited node - or a bound above - we attempt to change direction
                            matrix[row + directions[currentDirection][0]][col +
                                    directions[currentDirection][1]] !=
                                    VISITED
            ) {

                //Since the above is true we can keep this at 0 because we're not changing directions yet
                changeDirection = 0;

                //Our row goes up by the current direction
                row = row + directions[currentDirection][0];
                //Our column goes up by the current direction
                col = col + directions[currentDirection][1];
                //We add the next cell to our output
                result.add(matrix[row][col]);
                //Then we mark it as visited
                matrix[row][col] = VISITED;

                //The loop repeats until the above condition is not met
            }

            //Once it's not met - we can change direction
            //This current direction +1 % 4 - is the key
            currentDirection = (currentDirection + 1) % 4;


            //And we increase attempts by one
            //If this reaches two - then we've hit our last element
            changeDirection++;
        }

        return result;
    }
}
