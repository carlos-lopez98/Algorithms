package org.example.recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

    Map<Integer, Integer> cache = new HashMap<>();
    public int fib(int n) {
        if(n < 2){
            return n;
        }

        //if we get to an n that's already in the cache, we just return the result from that n
        if(cache.containsKey(n)){
            return cache.get(n);
        }

        //At every iteration we're calculating n-1 + n-2, then storing it with current n
        cache.put(n, fib(n - 1) + fib(n - 2));

        return cache.get(n);
    }
}

