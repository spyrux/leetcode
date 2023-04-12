class Solution {
    
    
    // it is an island when surrounded by edge or 0's 
    
    
    int num = 0;
    char[][] seen;
    
    public int numIslands(char[][] grid) {
        
        seen = new char[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                
                if(grid[i][j] == '1' && seen[i][j] != '*'){
                    dfs(grid, seen, i, j);
                    num++;
                }
               
            }
        }
        
        
        
        return num;
    }
    
    
    public void dfs(char[][] grid, char[][] seen, int x, int y){
        
        
        if(x >= grid.length || y >= grid[0].length || x < 0 || y < 0 ){
            return; 
        }
        
        
        if(grid[x][y] == '0' || seen[x][y] == '*'){
            return; 
        }
       
        
        
       
        seen[x][y] = '*';
        
        
        dfs(grid, seen, x+1, y);
        dfs(grid, seen, x-1, y);
        dfs(grid, seen, x, y+1);
        dfs(grid, seen, x, y-1);
        
        
        
        
    }
    
    
    
}