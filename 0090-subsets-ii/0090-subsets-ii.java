class Solution {
    
    List<List<Integer>> sets;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        sets = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0 , new ArrayList<>());
        
        return sets; 
        
    }
    
    
    
    
    public void dfs(int[] nums, int i, List<Integer> list){
        
        List<Integer> copy = new ArrayList<>(list);
        
        if(i >= nums.length){
           
            sets.add(copy);
          
            
            return;
        }
        
        copy.add(nums[i]);
        dfs(nums, i+1, copy);
        copy.remove(copy.size()-1);
        
        while(i + 1 < nums.length && nums[i] == nums[i+1]){
            
            i++;
            
        }
       
        dfs(nums, i +1, copy);
        
    }
}