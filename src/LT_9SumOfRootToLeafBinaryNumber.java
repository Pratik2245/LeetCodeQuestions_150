public class LT_9SumOfRootToLeafBinaryNumber {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        int ans=sumRootToLeaf(root);
        System.out.println(ans);
    }
    public static int sumRootToLeaf(TreeNode root) {

        return printRootToLeaf(root,0,0);
    }

    public static int printRootToLeaf(TreeNode root,int current,int ans){
        if(root==null){
            return 0;
        }
        current=current*2+root.val;
        if(root.left==null && root.right==null){
            return current;
        }
        return printRootToLeaf(root.left,current,ans)+
        printRootToLeaf(root.right,current,ans);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
