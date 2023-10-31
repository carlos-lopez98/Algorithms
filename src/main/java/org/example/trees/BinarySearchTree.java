package org.example.trees;

public class BinarySearchTree {

    private BinarySearchTreeNode root;

    private BinarySearchTree(BinarySearchTreeNode root){
        this.root = root;
    }


    //Now you need a method to insert into the tree once you've already initialized it;
    //You can make the constructor private, then just call the constructor if needed
    public void insert(BinarySearchTreeNode node){
        if(this.root == null){
            root = node;
            return;
        }

        //We're going to need to go down tree, and find the spot to insert
        this.root



    }


}
