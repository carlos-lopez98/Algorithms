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

    public BinarySearchTreeNode getValue(int value){

        return root.getValue(value);
    }

    public BinarySearchTreeNode get(int value){
        return root.getValue(value);
    }

    public int getMin(){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        return root.min();
    }

    public int getMax(){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        return root.max();
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private BinarySearchTreeNode delete(BinarySearchTreeNode subtreeRoot, int value){

        if(subtreeRoot == null){
            return null;
        }
        //If the value is less than the root we're searching
        //Replace the result of the
        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }

        else if(value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }

        else{
            //If the current node is a leaf, then the rightchild will be null
            //If it's a node with only a right child, then the rightchild will replace the node
            if(subtreeRoot.getLeftChild() == null){
                subtreeRoot.getRightChild();
            }

        }

        return null;
    }
}
