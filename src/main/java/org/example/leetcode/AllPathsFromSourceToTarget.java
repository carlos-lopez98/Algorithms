//package org.example.leetcode;
//
//import java.util.*;
//
///**
// *
// *Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1,
// * find all possible paths from node 0 to node n - 1 and return them in any order.
// *
// * The graph is given as follows: graph[i] is a list of all nodes
// * you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
// *
// * Example 1:
// * Input: graph = [[1,2],[3],[3],[]]
// * Output: [[0,1,3],[0,2,3]]
// * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
// *
// * Example 2:
// * Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
// * Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
// *
// * Constraints:
// * n == graph.length
// * 2 <= n <= 15
// * 0 <= graph[i][j] < n
// * graph[i][j] != i (i.e., there will be no self-loops).
// * All the elements of graph[i] are unique.
// * The input graph is guaranteed to be a DAG.
// */
//
//public class AllPathsFromSourceToTarget {
//
//    //To make our function calls simpler
//    //We can store some variables like the graph and target
//    //Easily as a universal class variable
//    int target;
//    int[][] graph;
//
//    List<List<Integer>> paths;
//
//
//
//    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//        this.target = graph.length -1;
//        this.graph = graph;
//        paths = new ArrayList<>();
//
//
//        List<Integer> path = new ArrayList<>();
//        path.add(0);
//
//        DFS( 0, path);
//
//        return paths;
//    }
//
//
//    public void DFS(int node, List<Integer> path){
//
//        //Base case - if we reach our target
//        //Then we can simply add a copy of our current path to the list of possible paths
//        //We add a copy since we're passing in path as a reference variable
//        if(node == target){
//            paths.add(new ArrayList<>(path));
//            return;
//        }
//
//        //Then we just call DFS on each neighboring node
//        for(int edge : graph[node]){
//
//            //At each recursive call we add that node to the path
//            path.add(edge);
//
//            DFS(edge, path);
//
//            //Then we pop from the path once we reach a viable path - this is to re-use the path variable path
//            path.removeLast();
//        }
//    }
//
//    public void BFS(int start, List<Integer> path){
//        if(start == target){
//            paths.add(new ArrayList<>(path));
//        }
//
//        if(graph == null || graph.length == 0){
//            return;
//        }
//
//        //Here we use a queue to simulate our current path
//        Queue<List<Integer>> queueForPath = new LinkedList<>();
//        path.add(0);
//
//        //Add our path into our queue - the queue will line up to our node
//        //If you think about it, your node will always be the first element in your path
//        //So when you do a queuePath.pop() you're retrieving the correct node
//        queueForPath.add(path);
//
//        while(!queueForPath.isEmpty()){
//
//            //Here we pop our current path into a temp variable
//            //This allows us to perform operations in a neater cleaner fashion
//            List<Integer> currentPath = queueForPath.poll();
//            //Then we get our current node
//            int node = currentPath.get(currentPath.size() - 1);
//
//            //Then we add each child node to the queue with it's respective path
//            for(int neighbor : graph[node]){
//                List<Integer> tmpPath = new ArrayList<>(currentPath);
//
//                tmpPath.add(neighbor);
//
//                //But if the neighbor is our target - there is no need to add it to the queue
//                //Instead we add it to our pathstoreturn
//                if(neighbor == target){
//                    //Remember to use new as we're using path as a reference variable
//                    paths.add(new ArrayList<>(tmpPath));
//                } else{
//                    queueForPath.add(new ArrayList<>(tmpPath));
//                }
//            }
//        }
//    }
//}
