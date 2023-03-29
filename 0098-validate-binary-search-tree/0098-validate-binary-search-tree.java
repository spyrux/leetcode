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
    
    
    
    
    public boolean dfs(TreeNode root, long minVal, long maxVal){
        
        if(root == null){
            return true;
        }
        if(root.val >= maxVal || root.val <= minVal){
            
            return false;
            
        }else{
            return dfs(root.left, minVal, root.val) && dfs(root.right, root.val, maxVal);
        }
        
    }
    
    
    
    public boolean isValidBST(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return dfs(root.left,  Long.MIN_VALUE, root.val) && dfs(root.right ,root.val, Long.MAX_VALUE);
        
        
        
    }
    
    
    
}