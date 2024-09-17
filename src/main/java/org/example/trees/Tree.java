package org.example.trees;
/*
*
* This class is meant to be the start of our tree
* We only hold a reference to the root node
*
* */

//In this implementation we will be ignoring duplicate values
public class Tree {

        private TreeNode root;


        public void insert(int value){

            if(root == null){
                root = new TreeNode(value);
            }else{
                root.insert(value);
            }
        }

        public void traverseInOrder(){
            if(root!=null){
                root.traverseInOrder();
            }
        }
}
