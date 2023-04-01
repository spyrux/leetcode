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

// inorder traversal
// at each node the max path sum is max of left+right+root, root+left, root+right 

class Solution {
    int maxValue;
   
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        
        dfs(root);
        
        return maxValue;
        
    }
    
    public int dfs(TreeNode node){
        
        if(node == null){
            return 0;
        }
        int left = Math.max(dfs(node.left),0);
        int right = Math.max(dfs(node.right),0);
        int maxPath = Math.max(node.val, Math.max(left + node.val + right ,Math.max(node.val+right,node.val+left)));
        if(maxPath > maxValue){
            maxValue = maxPath;
        }
        
        return node.val + Math.max(right, left);
    }
}