package org.example.greedy;

//This one is a tricky question to think about
//You must think about the moves you can make at each position
//You can move exactly two spaces over for each position and cost would be 0 for that move
//You'll notice here that you can converge all evens for free and all odds for free
//The only problem is when everything is converged, you have to move one pile to converge the other pile
//That will be the only time you count - whichever pile is smaller is the pile you choose
//Then you move to that position and that is your min count to converge
public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {

        int even_cnt = 0;
        int odd_cnt = 0;

        for(int i: position){
            if(i % 2 == 0){
                even_cnt++;
            }else{
                odd_cnt++;
            }

        }

        return Math.min(even_cnt, odd_cnt);
    }
}
