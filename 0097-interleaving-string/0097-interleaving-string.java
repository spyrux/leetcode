class Solution {
    
    
    
    public boolean isInterleave(String s1, String s2, String s3) {
        
        if(s3.length() != s1.length()+ s2.length()){
            return false;
        }
        Boolean[][] grid = new Boolean[s1.length()+1][s2.length()+1];
        grid[s1.length()][s2.length()]  = true;
       
        return  dfs(s1, s2, s3, 0, 0, grid);
        
    }
    
    public boolean dfs(String s1, String s2, String s3, int i1, int i2, Boolean[][] grid){
        
    
        if(i1 >= grid.length && i2 >= grid[0].length){
            return true;
        }
        
        
        if(grid[i1][i2] != null){
            return grid[i1][i2];
        }
        
        
        if(i1 < s1.length() && s1.charAt(i1) == s3.charAt(i1+i2) && dfs(s1, s2, s3, i1+1, i2, grid)){
            
            return true;
            
            
        }
        if(i2 < s2.length() && s2.charAt(i2) == s3.charAt(i1+i2) && dfs(s1, s2, s3, i1, i2+1, grid)){
            
            
            return true;
        }
        
        grid[i1][i2] = false;
        return false;
        
        
    }
    
    
    
}