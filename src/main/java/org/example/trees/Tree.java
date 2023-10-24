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
    //Think of coding this, as you're doing it one node at a time
    //Basically code it as if this were one iteration
    public static void inOrderTraversal(TreeNode root){

        //Base case is usually null
        if(root == null){
            return;
        }

        //We want to go to the first to last child, we don't want to go to last child till after we visit the current node
        for(int i = 0; i < root.children.size() - 1; i++){
            inOrderTraversal(root.children.get(i));
        }

        //This prints out the current root node, after we iterate over left most children
        //Access to our current node, since we want to access the children first, we do the for loop first
        System.out.println(root.name);

        //This prints out right most child,after the root node
        //We only do this if the current node has children
        if(!root.children.isEmpty()){
            inOrderTraversal(root.children.get(root.children.size()-1));
        }
    }
}
