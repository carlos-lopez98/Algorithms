package org.example.helper;

import java.util.Objects;

public class Pair<K,B> extends Object {

    K first;
    B second;


    public Pair(K first, B second){
        this.first = first;
        this.second = second;

    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true; // Check if it's the same instance
        if (!(o instanceof Pair<?, ?>)) return false; // Type check
        Pair<?, ?> pair = (Pair<?, ?>) o; // Safe cast

        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
