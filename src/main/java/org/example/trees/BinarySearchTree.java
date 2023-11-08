package org.example.trees;

public class BinarySearchTree {

    //What variables should our BinarySearchTree contain?
    BinarySearchTreeNode root;

    //Do we need a constructor in this case?
    public BinarySearchTree(BinarySearchTreeNode root) {
        this.root = root;
    }

    //What will our insert method do? Will the traversal be done here or in a lower level class?
    public void insert(int value) {
        if (this.root == null) {
            root = new BinarySearchTreeNode(value);
            return;
        }
        root.insert(value);
    }

    //Work for the get method will be done in the treeNode class
    public BinarySearchTreeNode getValue(int value) {
        if (root != null) {
            root.getValue(value);
        }

        return null;
    }


    public void delete(int value) {
        //Passes in the root of the tree we want to search through
        //Also the value we want to delete
        root = delete(root, value);
    }

    private BinarySearchTreeNode delete(BinarySearchTreeNode subTreeRoot, int value) {

        //This is basically a base case, if a subtree is passed in --> so a left or right child that is null
        //Then we just break the recursion and return null
        if (subTreeRoot == null) {
            return null;
        }

        //If the value less than, then we want to search to the left of the subTreeRoot
        //The first two if's are for searching basically, last else, will be if we run into our value we want to delete
        //This is where we'll handle our cases
        if (value < subTreeRoot.getData()) {
            //This will basically just move us down the left of the tree
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }
        //If the value is not greater or less, then it must be equal
        else {

            //When the value is equal, we want to delete this node, and if it has children, then replace it with one of
            //it's children
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }
        }


        return null;
    }

}
