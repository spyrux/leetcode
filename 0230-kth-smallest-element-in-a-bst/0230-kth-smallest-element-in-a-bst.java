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
    
    Queue<Integer> pq = new PriorityQueue<>();
    
    public int kthSmallest(TreeNode root, int k) {
        
        
        dfs(root);
        
        
        while(k > 1){
            pq.poll();
            k--;
        }
        
        return pq.poll();
        
    }
    
    public void dfs(TreeNode root){
        
        pq.add(root.val);
        
        if(root.left!=null) dfs(root.left);
        if(root.right!=null) dfs(root.right);
        
    }
    
}