package org.example.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1
 * (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] =
 * [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected
 * by at most one edge, and no vertex has an edge to itself.
 *
 * You want to determine if there is a valid path that exists from vertex source to vertex destination.
 *
 * Given edges and the integers n, source, and destination,
 * return true if there is a valid path from source to destination, or false otherwise.
 *
 * Example 1:
 * Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
 * Output: true
 * Explanation: There are two paths from vertex 0 to vertex 2:
 * - 0 → 1 → 2
 * - 0 → 2
 *
 * Example 2:
 * Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
 * Output: false
 * Explanation: There is no path from vertex 0 to vertex 5.
 *
 * Constraints:
 * 1 <= n <= 2 * 105
 * 0 <= edges.length <= 2 * 105
 * edges[i].length == 2
 * 0 <= ui, vi <= n - 1
 * ui != vi
 * 0 <= source, destination <= n - 1
 * There are no duplicate edges.
 * There are no self edges.
 */

public class FindIfPathExistsInGraph {

        public boolean validPath(int n, int[][] edges, int source, int destination){
            //Create an adjacency list
            Map<Integer, List<Integer>> graph = new HashMap<>();
            boolean[] visited = new boolean[n];

            //Code to build an adjacency list - basically a hashmap representation of a graph
            //Each key refers to a node, while the values is a list of all it's neighbors
            for(int[] node : edges){
                //[ 1, 0] // node 0 would be the key ---- 1, 0
                //[ 0, 1] // node 1 would be the key ---- 0, 1
                //[ 3, 1] // node 3 is the key --- 3, 1

                int row = node[0];
                int col = node[1];

                //Since this is an undirected graph, there would be a connection in both directions
                //So we would add row to our column value, and a col to our row value
                graph.computeIfAbsent(row, value -> new ArrayList<>()).add(col);
                graph.computeIfAbsent(col, value -> new ArrayList<>()).add(row);
            }

            //We're given the starting position as source
            //So we don't have to guesstimate where to start
            return DFS(graph, visited, source, destination);
        }


        public boolean DFS(Map<Integer, List<Integer>> graph, boolean[] visited, int currNode, int destination){
            //If we find our destination a path exists so return true
            if(currNode == destination){
                return true;
            }

            //If we haven't visited the currentNode then we add it to visited
            //If we have visited this will skip
            if(!visited[currNode]){
                visited[currNode] = true;

                //This will iterate through the list of neighbors for the current node
                for(int nextNode : graph.get(currNode)){

                    //If this returns true - that means we found our destination - if not the recursive call will
                    //Return false
                    if(DFS(graph,visited,nextNode,destination)){
                        return true;
                    }
                }
            }

            return false;
        }
}
