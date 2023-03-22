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
    
    
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] maxDepth = new int[1];
        maxDepth[0] = 0; 
        
        dfs(root,maxDepth);
    
        return maxDepth[0];
    }
    
    public int dfs(TreeNode root, int[] maxDepth){
        
        if(root == null){
            return 0;
        }
        
        int maxLeft = dfs(root.left, maxDepth);
        int maxRight = dfs(root.right, maxDepth);
        
        maxDepth[0] = Math.max(maxDepth[0], maxLeft + maxRight);
        
        return  Math.max(maxLeft, maxRight) + 1;
        
        
    }
}