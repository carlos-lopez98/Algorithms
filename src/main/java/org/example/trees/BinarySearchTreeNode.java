package org.example.trees;

public class BinarySearchTreeNode {

    //What variables should our BinaryTreeNode store?
    private int data;
    private BinarySearchTreeNode leftChild;
    private BinarySearchTreeNode rightChild;

    //Should our BinaryTreeNode have a Constructor? Yes Or No?
    public BinarySearchTreeNode(int value){
        this.data = value;
    }

    //What will our insert method do? Why isn't this implemented at a higher level?
    public void insert(int value){
        //What will be our base case?
        //We ignore duplicates
        if(value == this.data){
            return;
        }

        //How do we approach searching left and searching right?
        //At what point is our data inserted?
        if(value < this.data){
            if(leftChild == null){
                leftChild = new BinarySearchTreeNode(value);
                return;
            }else{
             leftChild.insert(value);
            }
        }else{
            if(rightChild == null){
                rightChild = new BinarySearchTreeNode(value);
                return;
            }
            rightChild.insert(value);
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

    //    //How would you implement a method to return a node, if it's data is equal to a certain value?
    public BinarySearchTreeNode getValue(int value){

        if(value == data){
            return this;
        }

        if(value < data && leftChild != null){
            return leftChild.getValue(value);
        }else if(rightChild != null){
            return rightChild.getValue(value);
        }

        return null;
    }

    //Think about binary trees, the min would be the left most child
    public int min(){
     if(leftChild == null){
         return this.data;
     }else{
         return leftChild.min();
     }
    }

    //If no more right children are present, then we're at the right most child so return it's data
    //If not keep traversing
    public int max(){
        if(rightChild == null){
            return this.data;
        }else{
            return rightChild.max();
        }
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
