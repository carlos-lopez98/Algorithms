package org.example.arrays;

public class ShellSort {
    //TODO Implement left to right ascending/ descending
    //TODO Implement right to left ascending/ descending

    //Choose a gap iteration?


    public static void shellSort(int[] array){

//        {20, 35, -15, 7, 55, 1, -22}


        for(int gap = array.length/2; gap >= 1; gap /= 2){
            System.out.println("Gap " + gap);
            for(int i =  0; i < array.length - gap; i++){
                int j = i;
                while(j + gap < array.length){
                    if (array[j] > array[j + gap]) {
                        int temp = array[j + gap];
                        array[j + gap] = array[j];
                        array[j] = temp;
                    }
                    j += gap;
                }
            }
        }
    }
}
