package Tree.LowestCommonAncestorOfBST;

import com.sun.source.tree.Tree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printNode(TreeNode node){

        if(node == null) return;
        System.out.print(node.val + " ");
        printNode(node.left);
        printNode(node.right);
    }

    public static TreeNode lowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q){

        TreeNode curr = root;
        while(curr != null){
            if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            } else if (p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            } else
                return curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left  = new TreeNode(0);
        root.left.right  = new TreeNode(4);
        root.left.left.left  = new TreeNode();
        root.left.left.right  = new TreeNode();
        root.left.right.left = new TreeNode(3);
        root.left.right.right  = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right  = new TreeNode(9);

        System.out.println("Original tree: ");
        printNode(root);

        System.out.print("LCM: ");
        System.out.print(lowestCommonAncestor(root, new TreeNode(0), new TreeNode(4)));


    }
}
