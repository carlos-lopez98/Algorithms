package org.example;

/*
*
* Given an array, colors, which contains a combination of the following three elements:
* 0(representing red)
* 1(representing white)
* 2(representing blue)
* Sort the array in place so that the elements of the same color are adjacent,
* with the colors in the order of red, white, and blue. The function should return the same array.
* */
public class SortColors {


    //The optimal way to solve this is to use three pointers
    //This only works because of how the problem is set up
    //There are only three numbers that could be in the array




    //This is technically the brute force solution
    public static int[] sortColors(int[] colors){

        for(int i = 0; i < colors.length; i++){
            for(int j = i+1; j < colors.length; j++){

                if(colors[i] > colors[j]){
                    int temp = colors[i];
                    colors[i] = colors[j];
                    colors[j] = temp;
                    break;
                }
            }
        }

        return colors;
    }
}
