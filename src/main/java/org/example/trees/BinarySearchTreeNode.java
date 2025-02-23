package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;

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

    public void printBFSOrder(BinarySearchTreeNode root){
        //Queue is meant to store items in the order we want
        //So it'll go root -> left child -> right child
       Queue<BinarySearchTreeNode> level = new LinkedList();
        level.add(root);

        int depth = 0;


        while (!level.isEmpty()){
            int length = level.size();


            System.out.println("Current Level " + depth);
            for(int i = 0; i < length; i++){
                BinarySearchTreeNode current = level.remove();

                System.out.print(current.data + " ");

                if(current.leftChild != null){
                    level.add(current.leftChild);
                }

                if(current.rightChild != null){
                    level.add(current.rightChild);
                }
            }

            System.out.println();
            depth++;
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
