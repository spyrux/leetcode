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
// do in postorder dfs
// at each parent node you add distance left and distance right and keep track of currmax also keep track of maxd of left and right 
class Solution {
    
    int maxDepth = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return maxDepth;
    }
    
    public int dfs(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int maxLeft = dfs(root.left);
        int maxRight = dfs(root.right);
        
        maxDepth = Math.max(maxDepth, maxLeft + maxRight);
        
        return  Math.max(maxLeft, maxRight) + 1;
        
        
    }
}