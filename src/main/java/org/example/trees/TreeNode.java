package org.example.trees;

import java.util.ArrayList;
import java.util.List;

/*
*
* Node used for our trees
*
* */
public class TreeNode {

        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data){
            this.data = data;
        }

        public void insert(int value){
            if (value == data){
                return;
            }

            if(value < data){
                if(leftChild == null){
                    value = this.data;
                }else{
                    leftChild.insert(value);
                }
            }else{

                if(rightChild == null){
                    value = this.data;
                }else{
                    rightChild.insert(value);
                }
            }
        }

        public void traverseInOrder(){

            if(leftChild != null){
                leftChild.traverseInOrder();
            }

            System.out.print("Data = " + data + ", ");

            if(rightChild != null){
                rightChild.traverseInOrder();
            }
        }


        public TreeNode get(int value){

            if (value == this.data){
                return this;
            }else if(value < data){
                if(this.getLeftChild() != null){
                    this.getLeftChild().get(value);
                }
            }else{
                if(this.getRightChild() != null){
                    this.getRightChild().get(value);
                }
            }

            //If the value isn't in the tree it'll return null
            return null;
        }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
