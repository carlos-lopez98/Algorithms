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

    //Since we have our variables at class level
    //There is no need to keep passing them into the recursive function
    int target;
    int[][] graph;

    List<List<Integer>> paths;



    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.target = graph.length -1;
        this.graph = graph;
        paths = new ArrayList<>();


        //Path is mutable, as we do DFS, we keep adding nodes to our path
        List<Integer> path = new ArrayList<>();
        path.add(0);

        DFS( 0, path);

        return paths;
    }


    public void DFS(int node, List<Integer> path){
        if(node == target){

            //We do a new ArrayList<> to ensure we store a copy of the path
            //If not, then as our path is edited, so is our reference to it
            paths.add(new ArrayList<>(path));
            return;
        }

        for(int edge : graph[node]){
            path.add(edge);

            //Recurse until we find a path
            DFS(edge, path);
            //Once we come out of recursion - we remove our path
            path.removeLast();
        }
    }

    public void BFS(int start, List<Integer> path){
        if(start == target){
            paths.add(new ArrayList<>(path));
        }

        //Break out of our BFS - will return the empty paths list we instantiated above
        if(graph == null || graph.length == 0){
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){

        }
    }
}
