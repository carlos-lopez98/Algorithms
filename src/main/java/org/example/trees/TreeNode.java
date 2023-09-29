package org.example.trees;

import java.util.ArrayList;
import java.util.List;

/*
*
* Node used for our trees
* */
public class TreeNode {
    //Notice how the tree nodes have children to relate to the other nodes

    public String name;
    public List<TreeNode> children = new ArrayList<>();

}
