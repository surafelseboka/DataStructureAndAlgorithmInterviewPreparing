package Tree.kthSmallestBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val) { this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printNodes(TreeNode node){
        if(node == null) return;

//        printPostOrder(node);
//        System.out.println("Printing Pre order");
//        printPreOrder(node);
    }

    public static int kthSmallest (TreeNode root, int k){


        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(--k == 0) break;
            root = root.right;
        }

        return root.val;

    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(0);
//        root.left.right = new  TreeNode(4);



    }

}

