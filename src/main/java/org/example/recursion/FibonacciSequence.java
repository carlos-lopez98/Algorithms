package org.example.recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

    public static Map<Integer, Integer> memo = new HashMap<>();
    public static int fib(int n){

        if(n <= 2) return 1;

        return fib(n - 1) + fib (n - 2);
    }


    //Memoization

    public static int fibDP(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        if(n <= 2) return 1;
        memo.put(n, fibDP(n - 2) + fibDP(n-1));
        return memo.get(n);
    }

}
