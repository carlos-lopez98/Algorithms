package org.example.trees;

public class BinarySearchTree {

    private BinarySearchTreeNode root;

    public BinarySearchTree(BinarySearchTreeNode root){
        this.root = root;
    }

    public BinarySearchTree(){
    }

    //If tree is empty, then the root becomes the data
    //Else we call insert, to see where the data will be inserted
    public void insert(int data){
        if(root == null){
            root = new BinarySearchTreeNode(data);
        }else{
            root.insert(data);
        }
    }

    public void printInOrder(){

        root.printInOrder(root);

    }

    public void printPreOrder(){
        root.printPreOrder(root);
    }

    public BinarySearchTreeNode getMax(){

        return  root.getMaxNode(root);
    }

    public BinarySearchTreeNode getMin(){

        return root.getMinNode(root);
    }

    public void printPostOrder(){
        root.printPostOrder(root);
    }

    public void printBFSOrder(){
        root.printBFSOrder(root);
    }
    public BinarySearchTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinarySearchTreeNode root) {
        this.root = root;
    }
}
