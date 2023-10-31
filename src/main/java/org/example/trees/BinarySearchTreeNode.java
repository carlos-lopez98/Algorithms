package org.example.trees;

public class BinarySearchTreeNode {
    //Think about the what each node needs to have
    //Int data for root value
    //Then a link to each left and right child
    //Why isn't it a list of children like in the regular tree implementation?
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    //Initializes our data to a value, when creating a root/ new node
    public BinarySearchTreeNode(int value){
        this.data = value;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }
}
