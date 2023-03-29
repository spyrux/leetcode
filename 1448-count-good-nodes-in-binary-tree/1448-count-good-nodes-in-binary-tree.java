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
    
    int goodNodes = 0;
    
    public void dfs(TreeNode root, int prev){
        if(root == null){
            return;
        }
        
        if(root.val >= prev){
            goodNodes++;
        }
        
        dfs(root.left, Math.max(root.val, prev));
        dfs(root.right, Math.max(root.val, prev));
        
    }
    
    
    public int goodNodes(TreeNode root) {
        
        if(root == null){
            return goodNodes;
        }else{
            
            dfs(root, root.val);
        }
        
        return goodNodes;
        
    }
}