/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        int large = Math.max(q.val, p.val);
        int small = Math.min(q.val, p.val);
        
        while(root.left!= null || root.right!= null){
            if(root.val > large){
                root = root.left;
            }else if(root.val < small){
            root = root.right;
            }else {return root;}
       
        }
        
       
      return null;
        
        
        
    }
}