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

    public static void inOrderTraversal(TreeNode root){

        if(root != null){
            System.out.println(root.name);
            if(root.children == null){


            }

        }



        System.out.println(ro);
    }
}
