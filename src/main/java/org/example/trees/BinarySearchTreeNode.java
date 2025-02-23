package org.example.trees;

public class BinarySearchTreeNode {

    private int data;
    private BinarySearchTreeNode leftChild;
    private BinarySearchTreeNode rightChild;


    //This insertion method does not automatically rebalance the tree
    public void insert(int data){

        //Handles duplicates by just ignoring them
        if(data == this.data){
            return;
        }

        if(data < this.data){
            if(this.leftChild == null){
                this.leftChild = new BinarySearchTreeNode(data);
            }else{
                this.leftChild.insert(data);
            }
        }else{
            if(this.rightChild == null){
                this.rightChild = new BinarySearchTreeNode(data);
            }else{
                this.rightChild.insert(data);
            }
        }

    }

    public void printInOrder( BinarySearchTreeNode node) {

        //Goes all the way down the left subtree

        if(node.leftChild != null){
            printInOrder(node.leftChild);
        }

        //Then prints
        System.out.print(node.data + " ");

        if(node.rightChild != null){
            printInOrder(node.rightChild);
        }
    }

    //Post order traversal is left -> right -> root
    public void printPostOrder (BinarySearchTreeNode node){

        if(node.leftChild != null){
            printPostOrder(node.leftChild);
        }

        if(node.rightChild != null){
            printPostOrder(node.rightChild);
        }

        System.out.print(node.data + " ");
    }

    public void printPreOrder(BinarySearchTreeNode node){

        if(node != null){
            System.out.print(node.data + " ");
        }

        if(node.leftChild != null){
            printPreOrder(node.leftChild);
        }

        if(node.rightChild != null){
            printPreOrder(node.rightChild);
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
