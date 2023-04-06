class Solution {
    
    Set<List<Integer>> sets;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        sets = new HashSet<>();
        
        dfs(nums, 0 , new ArrayList<>());
        
        return new ArrayList<>(sets); 
        
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
        dfs(nums, i+1, copy);
        
    }
}