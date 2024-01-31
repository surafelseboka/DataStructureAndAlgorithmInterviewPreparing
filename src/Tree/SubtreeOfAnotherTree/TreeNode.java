package Tree.SubtreeOfAnotherTree;

public class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;

    TreeNode(){}
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

    public static boolean isSubTree(TreeNode root, TreeNode subRoot){

        if(root == null) return false;
        if(isIdentical(root, subRoot)) return true;
        return isSubTree(root.left,subRoot) || isSubTree(root.right, subRoot);
    }

    public static boolean isIdentical(TreeNode a, TreeNode b){

        if(a == null && b == null) return true;
        if(a == null || b == null || a.val != b.val) return false;

        else {
            return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
        }
    }


    public static void main(String[] args) {

         TreeNode p = new  TreeNode(1);
        p.left = new  TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new  TreeNode(1);
        q.left = new  TreeNode(1);
        q.right = new TreeNode(3);

        printNodes(p);
        System.out.println();
        printNodes(q);
        System.out.println();

        System.out.println("Is the Sub Tree");
        System.out.println(isSubTree(p,q));

    }
}
