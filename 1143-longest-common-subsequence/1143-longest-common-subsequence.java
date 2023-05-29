class Solution {
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        Integer[][] grid = new Integer[text1.length()][text2.length()];
        
       
        
        return  dfs(text1, text2, 0,0, grid);
    }
    
    
    public int dfs(String text1, String text2, int index1, int index2, Integer[][] grid){
        
       
        if(index1 >= text1.length() ||index2 >= text2.length() ){
            return 0;
        }
        if(grid[index1][index2]!= null){
            return grid[index1][index2];
        }
        
        
        if(text1.charAt(index1) == text2.charAt(index2)){
           grid[index1][index2] = 1+ dfs(text1, text2, index1+1, index2+1, grid);
           
            return grid[index1][index2];
            
        }else{
            
           grid[index1][index2] =  Math.max(dfs(text1, text2, index1+1, index2, grid),
                           dfs(text1, text2, index1, index2+1, grid));
            return grid[index1][index2];
        }
        
       
        
        
        
    }
}