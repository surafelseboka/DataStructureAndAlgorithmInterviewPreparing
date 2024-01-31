package Tree.BinaryTrees;

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
    TreeNode(int val,  TreeNode left,  TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void printNodes(TreeNode node){
        if(node == null) return;
        System.out.print(node.val + " ");
        printNodes(node.left);
        printNodes(node.right);
    }

    //Sum of a trees
    public static int treeSum(TreeNode root){
        if(root == null) return 0;
        int leftSum = treeSum(root.left);
        int rightSum = treeSum(root.right);
        return root.val + leftSum + rightSum;
    }

    // Max value from the tree
    public static int maxTree(TreeNode root){
        if (root == null) return 0;
        int left = maxTree(root.left);
        int right = maxTree(root.right);
        return Math.max(root.val, Math.max(left,right));
    }

    // Min value from the tree
    public static int minTree(TreeNode root){
        if (root == null) return Integer.MAX_VALUE;
        int left = minTree(root.left);
        int right = minTree(root.right);
        return Math.min(root.val, Math.min(left,right));
    }

    // To get the height of the tree
    public static int treeHeight(TreeNode root){
        if (root == null) return 0;
        int left_Height = treeHeight(root.left);
        int right_height = treeHeight(root.right);
        return 1 + Math.max(left_Height, right_height);
    }

    //To check if the value is exists in the tree
    public static boolean existsInTree(TreeNode root, int value){
        if(root == null) return false;
        boolean left = existsInTree(root.left, value);
        boolean right = existsInTree(root.right, value);

        return root.val == value || left || right;
    }

    // Reverse a tree
    public static void reverseTree(TreeNode root){

        if(root == null) return;
        reverseTree(root.left);
        reverseTree(root.right);

       //Swapping method
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);

        System.out.println("Sum of tree: ");
        System.out.println(treeSum(root));

        System.out.println("Max value of a tree is: ");
        System.out.println(maxTree(root));

        System.out.println("Min value of a tree is: ");
        System.out.println(minTree(root));

        System.out.println("Height of a tree is: ");
        System.out.println(treeHeight(root));

        System.out.println("Does value exist: ");
        System.out.println(existsInTree(root, 30));

        System.out.println("reverse a tree");
        reverseTree(root);
        printNodes(root);

    }
}
