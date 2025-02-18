package org.example.leetcode;

/**
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
 *the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 */


public class BestTimetoBuyandSellStocks {

    public static int returnMaxProfit(int[] prices){

        int smallestValue = prices[0];
        int maxProfit = prices[1] - smallestValue;

        for(int i = 1; i < prices.length; i++){
            int current = prices[i];

            int dailyProfit = current - smallestValue;

            if(dailyProfit > maxProfit){
                maxProfit = dailyProfit;
            }

            if(current < smallestValue){
                smallestValue = current;
            }

           }

        return Math.max(maxProfit, 0);
    }
}
