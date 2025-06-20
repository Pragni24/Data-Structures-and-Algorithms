/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        if(val<root.val){
            searchBST(root.left,val);
        }else if(val>root.val){
            searchBST(root.right,val);
        }else{
            ans=root;
            return ans;
        }
        return ans;
    }

}
