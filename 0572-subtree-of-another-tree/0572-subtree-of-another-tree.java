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
    
    public boolean same(TreeNode root, TreeNode subRoot){
        
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(subRoot.val == root.val){
            return same(root.right, subRoot.right) && same(root.left,subRoot.left);
        }else{
            return false;
        }
        
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        
        
        if(root == null){
            return false;
        }
        
        if(same(root,subRoot)){
            return true;
        }

        return isSubtree(root.right, subRoot) || isSubtree(root.left,subRoot);
    
        
        
        
        
    }
    
    
    
}