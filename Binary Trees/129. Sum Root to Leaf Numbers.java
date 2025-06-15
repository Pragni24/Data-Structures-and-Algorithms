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
    int num;
    public int sumNumbers(TreeNode root) {
        num=0;
        return sum(root,num);
    }
    public int sum(TreeNode root,int num){
        if(root==null){
            return 0;
        }
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            return num;
        }
        return sum(root.left,num)+sum(root.right,num);
    }
}
