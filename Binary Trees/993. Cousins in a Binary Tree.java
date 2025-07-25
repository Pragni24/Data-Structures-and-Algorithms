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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            boolean foundX = false;
            boolean foundY = false;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove();
                //check if they are siblings
                if(node.left!=null && node.right!=null){
                    if(node.left.val==x && node.right.val==y || node.left.val==y && node.right.val==x) return false;
                }
                //check for x and y at current level
                if(node.left!=null){
                    queue.add(node.left);
                    if(node.left.val==x) foundX = true;
                    if(node.left.val==y) foundY=true;
                }
                if(node.right!=null){
                    queue.add(node.right);
                    if(node.right.val==x) foundX=true;
                    if(node.right.val==y) foundY=true;
                }
            }
            if(foundX && foundY) return true;
            if(foundX||foundY) return false;
        }
        return false;
    }
}
