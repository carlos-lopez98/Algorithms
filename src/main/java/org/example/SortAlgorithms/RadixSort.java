package org.example.SortAlgorithms;

public class RadixSort {

    //For radix sort, all values must have the same radix and width
    //What is the radix? -- the number of unique digits/ values that a numbering system/ value has -- 10 for the number
    //system as there are only 10 single digits available 0 - 9
    //What is the width? -- the length of the value -- 1234, width is 4, 10 is 2, 123 is three

    //This sorting algorithm assumes the radix and width for all values is the same
    public static void radSort(int[] input, int radix, int width){

        for(int i = 0; i < width; i++){

            //Calling radixSingleSort for each position in the value
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){

        //Stores items we're sorting
        int numItems = input.length;

        int[] countArray = new int[radix];

        for (int value: input){
            //Will return a digit at a position in our number
            countArray[getDigit(position, value, radix)]++;
        }

    }

    public static int getDigit(int position, int value, int radix){


        //Will return the digit you want based on the position you're at,
        //IE if you want the digit in the hundred position, then you'd be at position 2, Math.pow would return 100,
        //The value would be let's say 4725/ 100 gives you 472
        return value/ (int) Math.pow(10, position) % radix;
    }
}
