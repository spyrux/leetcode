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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            TreeNode dummy1 = null;
            TreeNode dummy2 = null;
            if(curr.left != null){
                dummy1 = curr.left;
            }
            
            if(curr.right!= null){
                dummy2 = curr.right;
            }
            
            
            curr.right = dummy1;
            curr.left = dummy2;
            if(curr.left != null){
                stack.push(curr.left);
            }
           
            if(curr.right!= null){
                stack.push(curr.right);
            }
           
        }
        return root;
    }
}