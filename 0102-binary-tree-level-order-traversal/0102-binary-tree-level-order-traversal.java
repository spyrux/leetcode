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
    public List<List<Integer>> levelOrder(TreeNode root) {
     
        List<List<Integer>> list = new ArrayList<>();
        
        
        if(root == null){
            return list;
        }
        
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            List<Integer> print = new LinkedList<>();
            //current level size
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                
                
                if(q.peek()!= null){
                    print.add(q.peek().val);
                    
                    if(q.peek().left!= null){
                        q.offer(q.peek().left);
                    }
                    if(q.peek().right!= null){
                        q.offer(q.peek().right);
                    }
                    
                }
                q.poll();
                
            }
            list.add(print);
        }
        return list;
    }
}