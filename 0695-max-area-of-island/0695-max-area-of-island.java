class Solution {
    
    

    
    
    int num = 0;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                
                if(grid[i][j] == 1 ){
                    
                    int size = dfs(grid, i, j);
                    num = Math.max(size, num);
                }
               
            }
        }
                
        return num;
    }
    
    
    public int dfs(int[][] grid, int x, int y){
        
        
        if(x >= grid.length || y >= grid[0].length || x < 0 || y < 0 ||grid[x][y] == 0 || grid[x][y] == 2){
            return 0; 
        }
              
       
        grid[x][y] = 2;
               
        
        return 1+ dfs(grid, x+1, y)+dfs(grid, x-1, y)+dfs(grid, x, y+1)+dfs(grid, x, y-1);
        
        
        
        
    }
    
    
    
}