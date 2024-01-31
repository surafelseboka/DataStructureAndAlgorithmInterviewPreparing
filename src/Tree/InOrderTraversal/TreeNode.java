package Tree.InOrderTraversal;

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

          printInOrder(node);

//        printPostOrder(node);
//        System.out.println("Printing Pre order");
//        printPreOrder(node);
    }

    public static void printInOrder(TreeNode node) {

        if(node == null) return;

        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void printPreOrder(TreeNode node) {

        if(node == null) return;

        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void printPostOrder(TreeNode node) {

        if(node == null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static List<Integer> inorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        //Using stack
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        System.out.println(list);
        return list;
    }





    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(0);
//        root.left.right = new  TreeNode(4);

        inorderTraversal(root);

        System.out.println("Printing Post order");
        printPostOrder(root);

        System.out.println();
        System.out.println("Printing Pre order");
        printPreOrder(root);

        System.out.println();
        System.out.println("Printing Inorder");
        printInOrder(root);

    }

}
