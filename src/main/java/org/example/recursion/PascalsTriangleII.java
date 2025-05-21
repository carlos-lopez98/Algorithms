package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

//Your base cases end up being the last row, and last before last
//You only return the currRow in each iteration
//The currRow then becomes prevRow, and you can do the calculations within the for loop
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        return buildRows(rowIndex);
    }

    public List<Integer> buildRows(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }

        if (rowIndex == 1) {
            return List.of(1, 1);
        }

        List<Integer> prevRow = buildRows(rowIndex - 1);

        List<Integer> currRow = new ArrayList<Integer>();

        currRow.add(1);

        for (int i = 1; i < rowIndex; i++) {
            currRow.add(prevRow.get(i) + prevRow.get(i - 1));
        }

        currRow.add(1);

        return currRow;
    }
}
