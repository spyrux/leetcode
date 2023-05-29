class Solution {
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] grid = new int[text1.length()][text2.length()];
        
        for(int i = 0; i < text1.length(); i++){
            for(int j = 0; j < text2.length(); j++){
                
                
                
                
                
                if(text1.charAt(i) == text2.charAt(j)){
                    
                    if(j > 0 && i > 0){
                        grid[i][j] = grid[i-1][j-1]+1;
                    }else{
                        grid[i][j] = 1;
                    }
                    
                    
                }else{
                    int max1 = 0;
                    int max2 = 0;
                    if(j > 0){
                        max1 = grid[i][j-1];
                    }
                    if(i > 0){
                        max2 = grid[i-1][j];
                    }
                    
                    grid[i][j] = Math.max(max1, max2);
                    
                }
                
               
            }
        }
        return grid[text1.length()-1][text2.length()-1];
    }
    
    
    
}