package org.example.hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashmap {

    //This represents a key value pair
    class Pair<U, V>{
        public U first;
        public V second;

        public Pair(U first, V second){
            this.first = first;
            this.second = second;
        }
    }

    //Bucket allows us to have a linkedlist implementation at a hashed key value - handling collisions
    class Bucket{
        //It's just a linkedlist that has a pair at each node position
        private List<Pair<Integer, Integer>> bucket;

        public Bucket(){
            this.bucket = new LinkedList<Pair<Integer,Integer>>();
        }


        public Integer get(int key){
            //Iterates through each pair node in the bucket
            //If the key is found, return it's value
            for(Pair<Integer, Integer> pair : this.bucket){
                if(pair.first.equals(key)){
                    return pair.second;
                }
            }

            return -1;
        }

        //If we find a key in our bucket
        //Then we just update it's value like in hashmap
        //Else we add a new pair to the bucket
        public void update(Integer key, Integer value){
            boolean found = false;

            for(Pair<Integer,Integer> pair: this.bucket){
                if(pair.first.equals(key)){
                    pair.second = value;
                    found = true;
                }
            }

            if(!found){
                this.bucket.add(new Pair<Integer, Integer>(key, value));
            }
        }

        public void remove(Integer key){
            for(Pair<Integer, Integer> pair: this.bucket){
                if(pair.first.equals(key)){
                    this.bucket.remove(pair);
                    break;
                }
            }

        }

    }

    class MyHashMap{
        private int key_space;
        private List<Bucket> hashTable;

        public MyHashMap(){
           this.key_space = 2069;
           this.hashTable = new ArrayList<>();

           //Adds a new bucket for our desired hashmap size
           for(int i = 0; i < this.key_space; i++){
               this.hashTable.add(new Bucket());
           }
        }

        public void put(int key, int value){
            int hash = key % this.key_space;

            //Returns the appropriate bucket then updates the bucket
            this.hashTable.get(hash).update(key, value);
        }

        public int get (int key){
            int hash = key % key_space;

            return hashTable.get(hash).get(key);
        }


        public void remove(int key){
            int hash = key % key_space;
            hashTable.get(hash).remove(key);
        }
    }
}
