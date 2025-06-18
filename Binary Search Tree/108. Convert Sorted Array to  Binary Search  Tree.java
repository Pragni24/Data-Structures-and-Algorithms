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
    TreeNode root=null;
    public TreeNode sortedArrayToBST(int[] nums) {
        populatedSorted(nums,0,nums.length);
        return root;
    }
    public TreeNode insert(int value){
        root = insert(value,root);
        return root;
    }
    public TreeNode insert(int value,TreeNode root){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(root.val>value){
            root.left=insert(value,root.left);
        }
        if(root.val<value){
            root.right=insert(value,root.right);
        }
        return root;
    }
    private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }
}
