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

        if(root == null){
            return;
        }

       for(int i = 0; i < root.children.size() - 1; i++){
           inOrderTraversal(root.children.get(i));
       }

        System.out.println(root.name);

        if(!root.children.isEmpty()){
            inOrderTraversal(root.children.get(root.children.size() - 1));
        }
    }


    public static void preOrderTraversal(TreeNode root){

        if(root==null){
            return;
        }

        //Perform action on current node
        System.out.println(root.name);

        int numChildren = root.children.size();

        for(int i = 0; i < numChildren; i++){
            preOrderTraversal(root.children.get(i));
        }
    }
}
