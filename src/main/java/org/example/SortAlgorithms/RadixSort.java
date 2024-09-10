package org.example.SortAlgorithms;

public class RadixSort {

    //For radix sort, all values must have the same radix and width
    //What is the radix? -- the number of unique digits/ values that a numbering system/ value has -- 10 for the number
    //system as there are only 10 single digits available 0 - 9
    //What is the width? -- the length of the value -- 1234, width is 4, 10 is 2, 123 is three

    //This sorting algorithm assumes the radix and width for all values is the same
    public static void radSort(int[] input, int radix, int width){

        //Will loop through the positions in our number
        for(int i = 0; i < width; i++){
            //Calling radixSingleSort for each position in the value
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){

        //Stores items we're sorting
        int numItems = input.length;

        int[] countArray = new int[radix];

        //Increment count for each value in the 1's
        //Second iteration, increment count for the 10's
        for (int value: input){
            //Will return a digit at a position in our number
            countArray[getDigit(position, value, radix)]++;
        }

        //Contains the number of values that have the specified digit or less than the specified digit
        //Adjusting counts
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];

        //Fill in temp array - with the sorted positions
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position,input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        //Copy temp array back into original array
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix){
        //Will return the digit you want based on the position you're at,
        //IE if you want the digit in the hundred position, then you'd be at position 2, Math.pow would return 100,
        //The value would be let's say 4725/ 100 gives you 472
        return value/ (int) Math.pow(radix, position) % radix;
    }
}
