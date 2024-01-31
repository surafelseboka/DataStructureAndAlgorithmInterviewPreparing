package Tree.DiameterOfBinaryTree;

/*
             ----- Approaches to solve any binary trees
               1. Find base condition
               2. Go to the left tree
               3. Go to the right tree
               4. Join the results
        */


public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int diameterOfBinaryTree(TreeNode root){

        int[] diameter = new int[1];
        getHeight(root, diameter);
        return diameter[0];
    }

    public static int getHeight(TreeNode node, int[] diameter){
        if(node == null) return 0;
        int left_height = getHeight(node.left, diameter);
        int right_height = getHeight(node.right, diameter);
        diameter[0] = Math.max(diameter[0], left_height + right_height);
        return 1 + Math.max(left_height,right_height);
    }

    public static void printNodes(TreeNode node){
        if(node == null) return;
        System.out.print(node.val + " ");
        printNodes(node.left);
        printNodes(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);

        System.out.println("Tree Value: ");
        printNodes(root);
        System.out.println("Diameter is: ");
        System.out.println(diameterOfBinaryTree(root));



    }
}
