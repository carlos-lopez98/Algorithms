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
/**
 * Optimized solution using prefix sums and nearest-candle tracking.
 *
 * Approach:
 * Traverse the string once to build
 *   1. A prefix sum of plates at each candle (prefixSum)
 *   2. An array (closestLeft) to track the nearest candle to the left for each index
 * - Traverse the string again from right to left to build:
 *   3. An array (closestRight) for the nearest candle to the right for each index
 *
 * Each query uses the two closest candles to determine how many plates
 * are between them using the prefixSum list.
 *
 * Time Complexity: O(n + q)
 */
public class PlatesBetweenCandles {

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();

        List<Integer> prefixSum = new ArrayList<>();
        int[] closestCandleLeftOfIndex = new int[n];
        int[] closestCandleRightOfIndex = new int[n];
        int[] result = new int[queries.length];

        int sum = 0;
        int index = -1;

        //Iterate from left to right to calculate prefixSum & closestCandlesLeft
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (curr == '*') {
                sum++;
                closestCandleLeftOfIndex[i] = index;
            } else {
                prefixSum.add(sum);
                index++;
                closestCandleLeftOfIndex[i] = index;
            }
        }

        //We reset index - because at the end of the for loop - candles = prefixSum.size()
        index = prefixSum.size();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                index--;
            }
            closestCandleRightOfIndex[i] = index;
        }

        //Third loop does the final calculation
        //We first make sure that there is space between both candles
        //Then we calculate our result for the the current position
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int leftCandle = closestCandleRightOfIndex[left];
            int rightCandle = closestCandleLeftOfIndex[right];

            if (leftCandle < rightCandle) {
                result[i] = prefixSum.get(rightCandle) - prefixSum.get(leftCandle);
            } else {
                result[i] = 0;
            }
        }

        return result;
    }
}
