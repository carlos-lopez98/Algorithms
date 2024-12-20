package org.example.trees;

public class BinarySearchTreeNode {

    private int data;
    private BinarySearchTreeNode leftChild;
    private BinarySearchTreeNode rightChild;


    public void insert(int data){
        if(this.data == data){
            return;
        }else if(data > this.data){
            if(rightChild == null){
                rightChild = new BinarySearchTreeNode(data);
            }else{
                rightChild.insert(data);
            }
        }else {
            if(leftChild == null){
                leftChild = new BinarySearchTreeNode(data);
            }else{
                leftChild.insert(data);
            }
        }
    }

    public BinarySearchTreeNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinarySearchTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinarySearchTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinarySearchTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
