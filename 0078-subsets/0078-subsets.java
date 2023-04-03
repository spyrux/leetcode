class Solution {
    
    List<List<Integer>> subset;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> empty = new ArrayList<>();
        subset = new ArrayList<>();
        
        
        subset.add(empty);
        
        if(nums == null){
            return subset;
        }
        
        for(int i = 0; i < nums.length;i++){
            List<List<Integer>> add = new ArrayList<>();
            
            for(int j = 0; j < subset.size(); j++){
                List<Integer> next = new ArrayList<>(subset.get(j));
                next.add(nums[i]);
                add.add(next);
                
                
            }
            subset.addAll(add);
            
            
        }
        
        return subset;
    }
}