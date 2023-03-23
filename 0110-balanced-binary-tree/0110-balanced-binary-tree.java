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
    
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        
        depth(root);
        return result;
        
    }
    
    
    
    
    public int depth(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int heightL = depth(root.left);
        int heightR = depth(root.right);
        
        if(heightL - heightR > 1 || heightR - heightL > 1){
            result = false; 
        }
        
        return 1 + Math.max(heightL , heightR);
        
    }
}