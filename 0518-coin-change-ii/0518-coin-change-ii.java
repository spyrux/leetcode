class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] grid = new Integer[amount+1][coins.length+1];
        
        return dfs(amount, coins, coins.length-1, grid);
        
    }
    
    
    
    public int dfs(int amount, int[] coins, int index, Integer[][] grid){
        
        if(amount == 0){
            return 1;
        }
        if(amount < 0 || index < 0){
            return 0;
        }
        
        if(grid[amount][index]!= null){
            return grid[amount][index];
        }
        
        if(amount < coins[index]){
            
            return grid[amount][index] = dfs(amount, coins, index-1, grid);
        }else if(amount == coins[index]){
            return grid[amount][index] = dfs(amount-coins[index], coins, index, grid) + dfs(amount,coins,  index-1, grid);
        }else{
            return grid[amount][index] = dfs(amount,coins,  index-1, grid) + dfs(amount-coins[index],coins,  index, grid);
        }
        
        
    }
    
    
    
    
}