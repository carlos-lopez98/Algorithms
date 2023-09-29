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

    //Visits the nodes in ascending order/ left-right, so left branch, parent, then right branch
    public static void inOrderTraversal(TreeNode root){
        //Implementing this with nodes, that have a list reference to children is a bit tricky

        if(root != null){
            if(!root.children.isEmpty()){
                //Go Left
                inOrderTraversal(root.children.get(0));

                //Retrieve current
                System.out.println(root.name);

                //Go Right
                for(int i = 1; i < root.children.size(); i++){
                    inOrderTraversal(root.children.get(i));
                }
            }else{
                System.out.println(root.name);
            }
        }
    }

    //Visits the current nodes before the children
    public static void preOderTraversal(TreeNode root){

        if(root != null){
            System.out.println(root.name);
            for(TreeNode node: root.children){
                preOderTraversal(node);
            }
        }
    }
}
