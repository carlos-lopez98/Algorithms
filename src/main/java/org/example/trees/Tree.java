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

        //What is our base case?
        //When a null node is passed in
        if(root == null){
            return;
        }

        //After checking our base case, what do we want to do?
        //Visit left-most children before you visit parent/ current
       for(int i = 0; i < root.children.size() - 1; i++){
           inOrderTraversal(root.children.get(i));
       }

        //What do we access after accessing all our left-most children?
        //Visit current - after you visit all left most children
        System.out.println(root.name);

        //What's the last step, to do in our current iteration?
        //Perform iteration on right most - after you visit current
        if(!root.children.isEmpty()){
            inOrderTraversal(root.children.get(root.children.size() - 1));
        }
    }
}
