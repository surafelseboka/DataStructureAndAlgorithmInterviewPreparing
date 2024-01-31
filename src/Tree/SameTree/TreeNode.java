package Tree.SameTree;

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
        System.out.print(node.val + " ");
        printNodes(node.left);
        printNodes(node.right);
    }

    // To be same - should be identical structure
    //              - Should have same values

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        else
            return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        q.right = new TreeNode(3);

        printNodes(p);
        System.out.println();
        printNodes(q);
        System.out.println();

        System.out.println(isSameTree(p,q));



    }
}
