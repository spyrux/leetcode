class Solution {
    //add infront or add behind
    List<List<Integer>> perms;
    
    
    public List<List<Integer>> permute(int[] nums) {
        perms = new ArrayList<>();
        dfs(nums, new ArrayList<>());
        return perms;
    }
    
    
    public void dfs(int[] nums, List<Integer> list){
       
        
        if(list.size() >= nums.length){
            perms.add(list);
            return;
        }
        
        
        for(int i = 0; i < nums.length;i++){
            List<Integer> copy = new ArrayList<>(list);
            if(copy.contains(nums[i])){
                continue;
            }
            copy.add(nums[i]);
            dfs(nums, copy);
        
        }
        
        
        
       
        
        
        
        
    }
}
