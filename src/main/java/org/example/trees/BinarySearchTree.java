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
}
