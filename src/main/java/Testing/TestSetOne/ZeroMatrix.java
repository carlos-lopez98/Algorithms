package Testing.TestSetOne;

/**
 * Write an algorithm such that if an element in an MXN matrix is 0, it's entire row and column are set to 0.
 */
public class ZeroMatrix {


    public static void zero(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 0){
                 rows[row] = true;
                 columns[col]= true;
                }
            }
        }

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(rows[row]){
                    matrix[row][col] = 0;
                }else if(columns[col]){
                    matrix[row][col] = 0;
                }
            }
        }
    }

    public static void printArray(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + ", ");
            }
            System.out.println();
        }
    }
}

/**
 * If you think about this one, you'll notice that you don't need to keep track of every element that is equal to zero
 * <p>
 * Just the row and column, so if you find position 2, 2 = 0, then you know second row and second column should be set
 * to zero
 * <p>
 * You'll have to iterate once through the array, keeping track of what rows and columns have zeroes. Then iterate again
 * and if you're in the column with a zero set all values = 0 in that colum, same thing for rows
 */
