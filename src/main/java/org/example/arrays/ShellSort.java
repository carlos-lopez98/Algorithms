package org.example.arrays;

public class ShellSort {
    //TODO Implement left to right ascending/ descending
    //TODO Implement right to left ascending/ descending

    //Choose a gap iteration?


    public static void shellSort(int[] array){

//        {20, 35, -15, 7, 55, 1, -22}


        for(int gap = array.length/2; gap >= 1; gap /= 2){
            for(int i =  0; i < array.length - gap; i++){
                int j = gap;
                int pointer = i;

                //You can't do an inner if statement -- it has to be a condition
                //in the while loop, since you want the variables to keep getting compared
                while(j < array.length){
                    if(array[i] > array[j]){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                    pointer+=gap;
                    j+= gap;
                }
            }
        }
    }
}
