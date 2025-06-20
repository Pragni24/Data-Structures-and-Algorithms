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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        if(root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int size = queue.size();
            if(!reverse){
                for(int i=0;i<size;i++){
                    TreeNode node = queue.poll();
                    res.add(node.val);
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
            }
            if(reverse){
                for(int i=0;i<size;i++){
                    TreeNode node = queue.pollLast();
                    res.add(node.val);
                    if(node.right!=null) queue.addFirst(node.right);
                    if(node.left!=null) queue.addFirst(node.left);
                    

                }
            }
            reverse=!reverse;
            list.add(res);
        }
        return list;
    }
}
