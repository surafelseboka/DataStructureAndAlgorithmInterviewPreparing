package Tree.DepthOfBinary;

public class TreeNode {

    int val;
     TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public static int maxDepth(TreeNode root){
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
     }

     public static int minDepth(TreeNode root){
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left,right) + 1;
     }

     public static void printTree(TreeNode node){
        if(node == null) return;
         System.out.print(node.val + " ");
         printTree(node.left);
         printTree(node.right);
     }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode();
        root.right = new TreeNode(3);
        root.right.left = new TreeNode();
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode();
        root.right.right.right = new TreeNode(5);
        root.right.right.right.left = new TreeNode();
        root.right.right.right.right = new TreeNode(6);

        System.out.print("Tree: ");
        printTree(root);

        System.out.println();


        System.out.print("Max Depth: ");
        System.out.println(maxDepth(root));

        System.out.println("Min Depth: ");
        System.out.println(minDepth(root));



    }



}
