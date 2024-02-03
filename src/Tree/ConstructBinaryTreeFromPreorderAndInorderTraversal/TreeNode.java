package Tree.ConstructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.HashMap;
import java.util.Map;

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

        printNodes(node.left);
        System.out.print(node.val + " ");
        printNodes(node.right);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        Map<Integer,Integer> inMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length-1,
                inorder, 0, inorder.length -1, inMap);

        printNodes(root);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                                     int[] inorder, int  inStart, int inEnd ,
                                     Map<Integer, Integer> inMap){

         if(preStart > preEnd || inStart > inEnd) return null;

         TreeNode root = new TreeNode(preorder[preStart]);
         int inRoot= inMap.get(root.val);
         int numLeft = inRoot - inStart;

         root.left = buildTree(preorder, preStart +1, preStart + numLeft,
                                inorder, inStart, inRoot -1, inMap);
         root.right = buildTree(preorder, preStart + numLeft +1, preEnd,
                                inorder, inRoot + 1,inEnd, inMap );
         return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        buildTree(preorder, inorder);

    }

}
