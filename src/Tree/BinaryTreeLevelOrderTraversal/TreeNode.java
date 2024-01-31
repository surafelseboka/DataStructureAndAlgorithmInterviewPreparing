package Tree.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left,  TreeNode right) {
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

    public static List<List<Integer>> levelOrder (TreeNode root){

        // Create an arraylist to print the list values
        List<List<Integer>> result = new ArrayList<>();

        //Checking the null condition here
        if(root == null) return result;

        //Creating a queue to hold the visited nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // check while the queue is empty
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int count  = queue.size();
            for (int i = 0; i < count ; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                
            }
            result.add(level);
        }
      return result;



    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

       //printNode(root);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);

    }
}
