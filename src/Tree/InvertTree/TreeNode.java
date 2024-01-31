package Tree.InvertTree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){ val = x;}

    public static void invertBinary(TreeNode root){
        // Check if the tree is null or not
        if(root == null){
            return;
        }

        //Swapping the left and right subtree
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //Recursively invert the left and right subtree
        invertBinary(root.left);
        invertBinary(root.right);
    }

    public static void printTree (TreeNode node){
        if (node == null) return;

        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left  = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Original tree");
        printTree(root);

        invertBinary(root);
        System.out.println();

        System.out.println("Inverted tree");
        printTree(root);
    }

}

