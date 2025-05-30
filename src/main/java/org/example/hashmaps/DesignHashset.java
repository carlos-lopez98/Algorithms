package org.example.hashmaps;

import java.util.LinkedList;


//The class capitalizes on using a linkedlist at the hash location
//The hash is performed by created a range that will be the size of our bucket array
//Then we just perform our operations at that position
public class DesignHashset {

    //This basically creates a linkedlist
    //At every possible key within our keyrange
    private Bucket[] bucketArray;
    private int keyRange;

    //Use an array to insert key
    //You can use a % operator to always return a value within a range, IE if you mod 101 by 100 you get 1, you'll
    //always get 0 - 100 as a value

    public DesignHashset() {
        //This can be any arbitrary value you decide
        this.keyRange = 769;

        //Creates on array of size keyRange
        this.bucketArray = new Bucket[this.keyRange];

        //Initialize our buckets
        for(int i = 0; i < this.keyRange; i++){
            this.bucketArray[i] = new Bucket();
        }

    }

    //This is a easy way to perform a hash operation
    //You just use the mod operator
    public int _hash(int key){
        //Returns a value from 0 - keyRange - essentially a hashvalue we can use to insert into our buckets
        return key % this.keyRange;
    }

    public void add(int key) {
        int bucketIndex = _hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this._hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }


    //Represents the store at each value
    class Bucket{
        private LinkedList<Integer> container;

        Bucket(){
        container = new LinkedList<Integer>();
        }

        public void insert(int key){
            int index = container.indexOf(key);

            //If the key is already in the bucket
            //index will return -1
            if(index == -1){
                this.container.addFirst(key);
            }
        }

        public void delete(int key){
            this.container.remove(key);
        }

        public boolean exists(int key){
            int index = this.container.indexOf(key);

            //if index is -1 it'll return false, if it doesn't equal -1
            //returns true
            return index != -1;
        }

    }

}
