/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        List<Node> current = new ArrayList<>();
        current.add(root);
        while(!current.isEmpty()){
            List<Node> next  = new ArrayList<>();
            for(int i=0;i<current.size();i++){
                Node node = current.get(i);
                if(node==null)continue;

                if(i<current.size()-1){
                    node.next = current.get(i+1);
                }

                if(node.left!=null) next.add(node.left);
                if(node.right!=null) next.add(node.right);
            }
            current=next;
        }
        return root;
    }
}
