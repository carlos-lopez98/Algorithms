package org.example.trees;

public class BinarySearchTreeNode {

    //What variables should our BinaryTreeNode store?
    int data;
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

    //How would you implement a method to return a node, if it's data is  equal to a certain value?
    public BinarySearchTreeNode getValue(int value){
        if(this.data == value){
            return this;
        }

        //When traversing left or right, we should account for null left child and right child

        if(this.data < value){
            if(rightChild != null){
                rightChild.getValue(value);

            }
        }else{
            if(leftChild != null){
                leftChild.getValue(value);
            }
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
}
