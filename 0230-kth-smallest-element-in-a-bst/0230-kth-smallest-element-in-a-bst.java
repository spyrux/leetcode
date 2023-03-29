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
    public int kthSmallest(TreeNode root, int k) {
        
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode top = q.poll();
            
            if(top != null){
                pq.offer(top.val);
            }
            
            if(top.left!=null) q.offer(top.left);
            if(top.right!=null) q.offer(top.right);
            
        }
        
        while(k > 1){
            pq.poll();
            k--;
        }
        
        return pq.poll();
        
    }
}