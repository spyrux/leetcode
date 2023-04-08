class Solution {
    
    List<List<Integer>> sets;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        sets = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0 , new ArrayList<>());
        
        return sets; 
        
    }
    
    
    
    
    public void dfs(int[] nums, int i, List<Integer> list){
        
        sets.add(new ArrayList<>(list));
    

        
        for(int start = i; start < nums.length;start++){
            if(start!=i &&nums[start] == nums[start-1]){
                continue;
            }
           
            list.add(nums[start]);
            dfs(nums,start+1,list);
            list.remove(list.size()-1);
        }
     
        
    }
}