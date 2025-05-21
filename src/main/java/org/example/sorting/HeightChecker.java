package org.example.sorting;

//The only way to do this with bubble sort
//Would be to clone the original array - sort the clone
//Then compare clone to original
//Return the count of mismatching elements
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        for(int i = 0; i < heights.length; i++){
            expected[i] = heights[i];
        }



        //Sort the expected array
        for(int sorted = heights.length - 1; sorted >= 0; sorted--){
            for(int i = 0; i < sorted; i++){
                if(expected[i] > expected[i + 1]){
                    swap(i, i+1, expected);
                }
            }
        }

        int mismatch = 0;

        //Compare expected vs heights returning any mismatched elements
        for(int i = 0; i< expected.length; i++){
            if(expected[i] != heights[i]){
                mismatch++;
            }
        }

        return mismatch;
    }


    private void swap(int one, int two, int[] heights){
        int temp = heights[one];
        heights[one] = heights[two];
        heights[two] = temp;
    }
}
