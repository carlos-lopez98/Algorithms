package org.example.leetcode;

import java.util.*;

/**
 *
 *Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1,
 * find all possible paths from node 0 to node n - 1 and return them in any order.
 *
 * The graph is given as follows: graph[i] is a list of all nodes
 * you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
 *
 * Example 1:
 * Input: graph = [[1,2],[3],[3],[]]
 * Output: [[0,1,3],[0,2,3]]
 * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 *
 * Example 2:
 * Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
 * Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 *
 * Constraints:
 * n == graph.length
 * 2 <= n <= 15
 * 0 <= graph[i][j] < n
 * graph[i][j] != i (i.e., there will be no self-loops).
 * All the elements of graph[i] are unique.
 * The input graph is guaranteed to be a DAG.
 */

public class AllPathsFromSourceToTarget {

    int target;
    int[][] graph;

    //Keeps a list of all viable paths
    List<List<Integer>> results;

    //No Cycles
    //Means we only need one hashmap for the adjacency list
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.target = graph.length - 1;
        this.graph = graph;

        this.results = new ArrayList<>();

        LinkedList<Integer> path = new LinkedList<>();
        path.addLast(0);

        this.backTrack(0,path);

        return this.results;
    }

    public void backTrack(int currNode, LinkedList<Integer> path ){
        //Our base case - if we reach a node = to target - we have a viable path
        if(currNode == this.target){
            this.results.add(new ArrayList<>(path));
            return;
        }

        //If not we recurse down the neighbor nodes
        for(int nextNode : this.graph[currNode]){
            //You add next node to path
            path.addLast(nextNode);
            this.backTrack(nextNode, path);

            //Once you pop off from the call stack you remove the node
            //Essentially, you backtracked at this point
            path.removeLast();
        }
    }
}
