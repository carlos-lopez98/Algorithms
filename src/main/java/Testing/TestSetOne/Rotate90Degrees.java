package Testing.TestSetOne;

/**
 * Given an image represented by NXN matrix, where each pixel in the image is represented by an integer, write a method
 * to rotate the image by 90 degrees. Can you do this in place?
 */
public class Rotate90Degrees {


    public static void rotate90(int[][] matrix){

        transpose(matrix);

        //Swap columns logic
        for(int row = 0; row < matrix.length; row++){
            //Two col pointers that move inward
            for(int colLeft = 0, colRight = matrix[row].length - 1; colLeft < colRight; colLeft++, colRight--){
                int temp = matrix[row][colRight];
                matrix[row][colRight] = matrix[row][colLeft];
                matrix[row][colLeft] = temp;
            }
        }

    }


    //This will turn all rows to columns
    public static void transpose(int[][] matrix) {
     for(int row = 0; row < matrix.length; row++){
         for(int col = row; col < matrix[row].length; col++){
          int temp = matrix[row][col];
          matrix[row][col] = matrix[col][row];
          matrix[col][row] = temp;
         }
     }
    }

    public static void printArray(int[][] matrix){
        for(int row = 0; row< matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

/**
 * Input:
 * [ 1, 2, 3, 4]
 * [ 5, 6, 7, 8]
 * [ 9,10,11,12]
 * [13,14,15,16]
 * <p>
 * After Transposing:
 * [ 1, 5, 9, 13]
 * [2, 6, 10, 14]
 * [3, 7, 11, 15]
 * [4, 8, 12, 16]
 * <p>
 * We want
 * [13, 9, 5, 1]
 * [14, 10, 6,2]
 * [15,11, 7, 3]
 * [16,12, 8, 4]
 * <p>
 * To get to the final position we'd only have to do a simple column swap
 * <p>
 * So the steps are transpose on the diagonal, then swap columns to basically reverse the order
 */
