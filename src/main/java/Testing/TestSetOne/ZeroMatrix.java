package Testing.TestSetOne;

/**
 * Write an algorithm such that if an element in an MXN matrix is 0, it's entire row and column are set to 0.
 */
public class ZeroMatrix {
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
