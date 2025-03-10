package org.example.leetcode;

import java.util.Random;

/**
 * You are given a 0-indexed array of positive integers w where w[i] describes the weight of the ith index.
 *
 * You need to implement the function pickIndex(), which randomly picks an index in the
 * range [0, w.length - 1] (inclusive) and returns it. The probability of picking an index i is w[i] / sum(w).
 *
 * For example, if w = [1, 3], the probability of picking index 0 is 1 / (1 + 3) = 0.25 (i.e., 25%),
 * and the probability of picking index 1 is 3 / (1 + 3) = 0.75 (i.e., 75%).
 *
 * Example 1:
 * Input
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output
 * [null,0]
 *
 * Explanation
 * Solution solution = new Solution([1]);
 * solution.pickIndex(); // return 0. The only option is to return 0 since there is only one element in w.
 *
 * Example 2:
 * Input
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output
 * [null,1,1,1,1,0]
 *
 * Explanation
 * Solution solution = new Solution([1, 3]);
 * solution.pickIndex(); // return 1. It is returning the second element (index = 1) that has a probability of 3/4.
 * solution.pickIndex(); // return 1
 * solution.pickIndex(); // return 1
 * solution.pickIndex(); // return 1
 * solution.pickIndex(); // return 0. It is returning the first element (index = 0) that has a probability of 1/4.
 *
 * Since this is a randomization problem, multiple answers are allowed.
 * All of the following outputs can be considered correct:
 * [null,1,1,1,1,0]
 * [null,1,1,1,1,1]
 * [null,1,1,1,0,0]
 * [null,1,1,1,0,1]
 * [null,1,0,1,0,0]
 * ......
 * and so on.
 *
 * Constraints:
 * 1 <= w.length <= 104
 * 1 <= w[i] <= 105
 * pickIndex will be called at most 104 times.
 */
public class RandomPickWithWeight {


    class Solution{

        public double[] oddRange;


        public Solution(int[] w){
            oddRange = new double[w.length];

            int sum = 0;

            for(int weight: w){
                sum += weight;
            }

            for(int i = 0; i < oddRange.length; i++){
                if(i == 0){
                    oddRange[i] = calculateProbability(w[i], sum);
                }else{
                    oddRange[i] = calculateProbability(w[i], sum) + oddRange[i - 1];
                }
            }
        }

        public double calculateProbability(int weight, int sum){
            return (double) weight/sum;
        }

        //Returns the index based on probability
        public int pickIndex(){
            Random randomNumGenerator = new Random();

            //Generates a random int from 1 - 100
            double target = randomNumGenerator.nextDouble();
            int left = 0;
            int right = oddRange.length - 1;

            while (left <= right){
                int midpoint = left + (right - left)/2;

                if(oddRange[midpoint] > target){
                    right = midpoint - 1;
                }else{
                    left = midpoint + 1;
                }
            }

            return left;
        }
    }
}
