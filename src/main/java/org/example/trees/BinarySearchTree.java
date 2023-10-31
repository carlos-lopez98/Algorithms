package org.example.trees;

public class BinarySearchTree {

    private BinarySearchTreeNode root;

    private BinarySearchTree(BinarySearchTreeNode root){
        this.root = root;
    }


    //Now you need a method to insert into the tree once you've already initialized it;
    //You can make the constructor private, then just call the constructor if needed
    public void insert(int value){
        if(this.root == null){
            this.root = new BinarySearchTreeNode(value);
            return;
        }

        //We're going to need to go down tree, and find the spot to insert at
        //This method will be the one doing the work - it'll go down and find the position to insert at
        this.root.insert(value);
    }
}
