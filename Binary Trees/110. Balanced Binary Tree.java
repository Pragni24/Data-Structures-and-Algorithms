class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}
        return Math.abs(height(root.left)-height(root.right))<=1;
    }
    private int height(TreeNode root){
        if(root.left==null && root.right==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
