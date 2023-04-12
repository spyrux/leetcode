class Solution {
    
    
    // it is an island when surrounded by edge or 0's 
    
    
    
    
    
    public int numIslands(char[][] grid) {
        
        int num = 0;
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                
                if(grid[i][j] == '1' ){
                    dfs(grid, i, j);
                    num++;
                }
               
            }
        }
        
        
        
        return num;
    }
    
    
    public void dfs(char[][] grid, int x, int y){
        
        
        if(x >= grid.length || y >= grid[0].length || x < 0 || y < 0 ||grid[x][y] == '0' || grid[x][y] == '2'){
            return; 
        }
        
        
        
        
        
       
        grid[x][y] = '2';
        
        
        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
        
        
        
        
    }
    
    
    
}