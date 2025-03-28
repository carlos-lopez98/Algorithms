package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * There is a long table with a line of plates and candles arranged on top of it. You are given a 0-indexed string
 * s consisting of characters '*' and '|' only, where a '*' represents a plate and a '|' represents a candle.
 *
 * You are also given a 0-indexed 2D integer array queries where queries[i] = [lefti, righti]
 * denotes the substring s[lefti...righti] (inclusive). For each query, you need to find the number of
 * plates between candles that are in the substring. A plate is considered between candles
 * if there is at least one candle to its left and at least one candle to its right in the substring.
 *
 * For example, s = "||**||**|*", and a query [3, 8] denotes the substring "*||**|".
 * The number of plates between candles in this substring is 2, as each of the two plates
 * has at least one candle in the substring to its left and right.
 * Return an integer array answer where answer[i] is the answer to the ith query.
 *
 * Example 1:
 * Input: s = "**|**|***|", queries = [[2,5],[5,9]]
 * Output: [2,3]
 * Explanation:
 * - queries[0] has two plates between candles.
 * - queries[1] has three plates between candles.
 *
 * Example 2:
 * Input: s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
 * Output: [9,0,0,0,0]
 * Explanation:
 * - queries[0] has nine plates between candles.
 * - The other queries have zero plates between candles.
 *
 * Constraints:
 * 3 <= s.length <= 105
 * s consists of '*' and '|' characters.
 * 1 <= queries.length <= 105
 * queries[i].length == 2
 * 0 <= lefti <= righti < s.length
 */
public class PlatesBetweenCandles {

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();

        //We need an empty list, that will keep track of the prefix sum
        //We use an array list because we don't know how many potential candles there are going to be
        List<Integer> prefixSum = new ArrayList<>();

        //Each array keeps track of the candle closest to the current index - one is closest to the left
        //The other closest to the right
        int[] closestLeft = new int[n];
        int[] closestRight = new int[n];

        //This will keep track of how many plates up to the current point we have
        int sum = 0;

        //This will track the current candle prefixSum index - it represents the index for a candle
        //And in the prefixSum List it stores the current running count of plates up to the candle
        int index = -1;

        //First iteration through string
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);

            if(curr == '*'){
                sum++;
                //If a string starts with ***, then these indices - don't have a closestLeft candle - so we set them
                //To -1
                closestLeft[i] = index;
            }else{ // If we reach a candle - we can update our prefixsum list
                //so at first candle or zeroth candle sum = sum
                //our index can move up, and starting at this point, our closestLeft candle is the candle at index
             prefixSum.add(sum);
             index++;
             closestLeft[i] = index;
            }
        }

        //Now we can build our closestRight - to do this we iterate from the right inward
        index = prefixSum.size();
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '|') {
                    index--;
                }
                closestRight[i] = index;
            }

        int[] result = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
          int left = queries[i][0];
          int right = queries[i][1];

          int leftCandle = closestRight[left];
          int rightCandle = closestLeft[right];

          if(leftCandle < rightCandle){
              result[i] = prefixSum.get(rightCandle) - prefixSum.get(leftCandle);
          }else{
              result[i] = 0;
          }

        }

        return result;
    }
}
