package Tree.BinaryTreeRightSideView;

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

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer>  rightSideView (TreeNode root){
        List<Integer> result = new ArrayList<>();

        // Check if the root node is not empty

        if(root == null) return result;

        // Create a queue to hold the values of the tree nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            List<Integer> level = new ArrayList<>();
            int count  = queue.size();



            for(int i=0; i < count; i++){

                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null){
                    queue.remove(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.addAll(level);
        }

        return result;
    }
}
