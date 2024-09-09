package org.example.leetcode;

/*
* Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns an
* equilibrium index (if any) or -1 if no equilibrium index exists.
*
* The equilibrium index of an array is an index such that the sum of elements at
* lower indexes is equal to the sum of elements at higher indexes.
* */
public class EquilibriumPointInArray {

    //Find the sum at each index from left to right and save them into a separate array
    //It'll be the same size of the original array
    //Now to get Left sum, it'll be the current sum[i] minus the original array[index] value
    // To get right sum, it'll be total sum - sum up to current iteration i - then you check if they're equal
    //If they are return the current index as it's the equilibrium point
    //If not equal iterate again, until you reach the end of the list - return -1 if no point is found
    public static int findEquilibriumOptimal(int arr[], int n){
        int[] sums = new int[arr.length];
        //Set's first sum to beginning int
        int currentSum = arr[0];
        sums[0] = currentSum;

        //Iterate through first array and add the elements to a new sum[] array
        for(int i = 1; i < n; i++){
            //saves each sum into corresponding space
            sums[i] = currentSum += arr[i];
        }

        //We want the pointer to start at one to avoid a leftSum at position 0
        for(int j = 1; j < n; j++){
            //Keeps track of Total, Left and Right Sums
            int total = sums[arr.length - 1];
            int leftSum = sums[j - 1];
            int rightSum = total - sums[j];

            if(leftSum == rightSum){
                return j;
            }
        }
        return -1;
    }




    //Another route would be to sum left up to point I
    //Then sum right starting at point I if they equal return I
    //Then just keep doing this until you reach the end of the list
    // else return -1
    //This solution works, but it's not optimized it's O(N^2)
    public static int findEquilibrium(int arr[], int n)
    {
        //add code here
        //i will be the pivot point
        //it'll keep moving forward until we reach an equilibrium point
        for(int i = 0; i < n; i++){

            int leftSum = 0;
            int rightSum = 0;

            //Find Left Sum
            for(int j = 0; j < i; j++){
                if(i == 0){
                    break;
                }else{
                    leftSum += arr[j];
                }
            }

            //Find Right Sum
            if(i != n){
                for(int k = i + 1; k < n; k++){
                    rightSum += arr[k];
                }
            }

            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }



}
