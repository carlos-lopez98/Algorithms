package org.example.trees;

public class BinarySearchTree {

    //What variables should our BinarySearchTree contain?
    BinarySearchTreeNode root;
    //Do we need a constructor in this case?
    public BinarySearchTree(BinarySearchTreeNode root){
        this.root = root;
    }

    //What will our insert method do? Will the traversal be done here or in a lower level class?
    public void insert(int value){
        if(this.root == null){
            root = new BinarySearchTreeNode(value);
            return;
        }
        root.insert(value);
    }

    //Work for the get method will be done in the treeNode class
    public BinarySearchTreeNode getValue(int value){
        if(root != null){
            root.getValue(value);
        }

        return null;
    }

    public BinarySearchTreeNode delete(){
        return null;
    }
}
