package org.example.trees;


/*
*
* This class is meant to be the start of our tree
* We only hold a reference to the root node
*
* */
public class Tree {
    public TreeNode root;


    public Tree(){
    }
    public Tree(TreeNode root){
        this.root = root;
    }

    //This is post order Traversal, you'll end up traversing all the children nodes
    //before the parent node is addressed
    public static void postOrderTraversal(TreeNode root){

        if(root != null){
            if(root.children != null){
                for(TreeNode node: root.children){
                    postOrderTraversal(node);
                }
            }
            System.out.println(root.name);
        }
    }

    public static void inOrderTraversal(TreeNode root){

    }

    public static void preOderTraversal(TreeNode root){


    }
}
