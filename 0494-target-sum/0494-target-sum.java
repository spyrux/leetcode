class Solution {
    
    
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int total = 0;
        for(int i = 0; i < nums.length;i++){
            total+=nums[i];
        }
        Integer[][] grid = new Integer[total+1][nums.length];
        return dfs(nums,target , nums.length-1, grid);
        
        
        
    }
    
    public int dfs(int[] nums, int target, int index, Integer[][] grid){
        
        if(target < 0){
            return dfs(nums, -target, index, grid);
        } 
        if(index < 0 || index >= nums.length || target >= grid.length){
            return 0;
        }
        
        if(target == nums[index] && index == 0){
            if(nums[index] == 0){
                return grid[target][index] = 2;
            }else{
                return grid[target][index] = 1;
            }
            
        }
        
        if(grid[target][index]!= null){
            return grid[target][index];
        }
        
        
        
        
        
        return grid[target][index] = dfs(nums, target-nums[index],index-1,grid)+dfs(nums, target+nums[index],index-1, grid);
        
        
    }
    
    
}