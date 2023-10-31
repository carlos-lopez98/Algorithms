package org.example.trees;

public class BinarySearchTreeNode {
    //Think about the what each node needs to have
    //Int data for root value
    //Then a link to each left and right child
    //Why isn't it a list of children like in the regular tree implementation?
    private int data;
    private BinarySearchTreeNode leftChild;
    private BinarySearchTreeNode rightChild;

    //Initializes our data to a value, when creating a root/ new node
    public BinarySearchTreeNode(int value){
        this.data = value;
    }

    //We insert into left if the value is lower than root and left is null
    //We insert into right if the value is greater than root and right is null
    //If not null, then we keep going down the tree, until we find a null spot
    //Since this is a recursive call, find a base case
    public void insert(int value){
        if( value == data){
            return;
        }

        //We go left
        if(value < this.data){
            //If left child is null, we found our spot, insert data
            if(leftChild == null){
                //insertion
                leftChild = new BinarySearchTreeNode(value);
                return;
            }else{
                //We call the insert method on it's non null leftChild
                leftChild.insert(value);
            }
        }

        //This will be if the value is greater, as the equal case is handled first
        else{
            //We found our spot
            if(rightChild == null){
                rightChild = new BinarySearchTreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return leftChild;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.leftChild = left;
    }

    public BinarySearchTreeNode getRight() {
        return rightChild;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.rightChild = right;
    }
}
