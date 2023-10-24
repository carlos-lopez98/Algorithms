package org.example.trees;
/*
*
* This class is meant to be the start of our tree
* We only hold a reference to the root node
*
* */

public class Tree {

    public TreeNode root;


    //This will just be a method that prints out our Tree in order
    //We must print left most children, then root, then right most child
    public void inOrderTraversal(TreeNode root){

        if(root.children.isEmpty()){
            System.out.println(root.name);
            return;
        }else{


         for(TreeNode current: root.children){
             inOrderTraversal(current);
         }
        }
    }
}
