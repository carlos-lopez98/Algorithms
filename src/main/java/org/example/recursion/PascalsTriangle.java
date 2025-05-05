package org.example.recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) return triangle;

        triangle = createRows(numRows);

        return triangle;
    }

    public List<List<Integer>> createRows(int numRows){

        if(numRows == 1){
            List<List<Integer>> base = new ArrayList<>();
            base.add(List.of(1));
            return base;
        }

        if(numRows == 2){
            List<List<Integer>> base = new ArrayList<>();
            base.add(List.of(1));
            base.add(List.of(1,1));

            return base;
        }

        List<List<Integer>> base = createRows(numRows - 1);

        List<Integer> currRow = new ArrayList<>();
        List<Integer> prevRow = base.get(numRows - 2);

        currRow.add(1);

        for(int i = 1; i < numRows - 1; i++){
            currRow.add(prevRow.get(i) + prevRow.get(i - 1));
        }

        currRow.add(1);

        base.add(currRow);

        return base;
    }
}
