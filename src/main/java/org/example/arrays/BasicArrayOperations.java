package org.example.arrays;

public class BasicArrayOperations {

/**
 * Create an array
 */
    public int[] createIntArray(int one, int two, int three, int four, int five){

        return new int[]{one, two, three, four, five};
    }

/**
 * Access Elements
 */

    public void printFirstElement(int[] nums){
        System.out.println(nums[0]);
    }

    public void printLastElement(int[] nums){
        System.out.println(nums[nums.length-1]);
    }

/**
 * Change Value
 */

    public static void changeElementAtIndex(int[] nums, int index, int value){

        for(int i = 0; i < nums.length; i++){

            if(i == index){
                nums[i] = value;
            }
        }

    }


/**
 * Find the length of an array without the .length method
 */

    public static int findLength(int[] nums){

        int i = 0;

        for (int j: nums){
            i++;
        }

        return i;
    }


/**
 *Print all elements of the provided array
 */

    public static void printElements(int[] nums){
        for(int j : nums){
            System.out.println(j);
        }
    }

    /**
     * Print the sum of all elements in the array
     */

    public static void sumElements(int[] nums){
        int sum = 0;

        for(int j: nums){
            sum += j;
        }

        System.out.println(sum);
    }


    /**
     * Print the average of all elements within the array
      */

    public static void averageElements(int[] nums){
        if (nums.length == 0){
            System.out.println("Array does not contain any elements");
        } else{
            int sum = 0;

            for(int j: nums){
                sum += j;
            }


            System.out.println(sum/nums.length);
        }
    }
}
