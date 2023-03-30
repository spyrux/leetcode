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

// l root right
// root l right

class Solution {
    int preorderIndex;
    Map<Integer,Integer> map;
    
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        preorderIndex = 0;
        map = new HashMap<>();
        
        
        
        
        for(int i = 0; i  < inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        return dfs(preorder, 0, preorder.length-1);
        
    }
    
    public TreeNode dfs(int[] preorder, int left, int right){
        
        
        if(left > right){
            
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preorderIndex]);
        preorderIndex++;
        root.left = dfs(preorder, left, map.get(root.val)-1);
        root.right = dfs(preorder, map.get(root.val) + 1, right);
        
        
        return root;
    }
}