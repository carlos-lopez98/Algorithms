package org.example.trees;

public class BinarySearchTree {

    public BinarySearchTreeNode root;

    public void insert(int data){
        if(root == null){
            root = new BinarySearchTreeNode(data);
        }else{
            root.insert(data);
        }
    }

    public void traverseInOrder(){
        root.traverseInOrder();
    }

    public BinarySearchTreeNode getValue(int value){

        return root.getValue(value);
    }

    public BinarySearchTreeNode get(int value){
        return root.getValue(value);
    }

    public int getMin(){
        return root.min();
    }

    public int getMax(){
        return root.max();
    }
}
