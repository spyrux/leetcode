class Solution {
    public int numIslands(char[][] grid) {
        // in order for a 1 to be an island has to be surrounded by 0's 
        if(grid == null || grid.length == 0){
            return 0;
        }
        int numIslands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    numIslands += 1;
                }
            }
        }
        return numIslands; 
    }
    
    
    
    
    
    public void dfs(char[][] grid, int i, int j){
        if(i < 0||i >= grid.length|| j < 0 || j >= grid[i].length|| grid[i][j] == '0'|| grid[i][j] == '2'  ){
            return ;
        } 
        grid[i][j] = '2';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
  
        }
        
        
    
    
}



