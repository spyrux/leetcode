class Solution {
    
    int amount = 0;
    
    public int countSubstrings(String s) {
        boolean[][] vis = new boolean[s.length()][s.length()];    
        dfs(s, 0, 0, vis);
        
        return amount;
    }
    
    public void dfs(String s, int start, int end, boolean[][] vis){
        if(end > s.length() -1){
            return;
        }
             
        if(isPalindromic(s.substring(start,end +1))){
            
            if(!vis[start][end]){
                amount++;
            }
            
        }
        vis[start][end] = true;
        if(end < s.length() -1 && !vis[start][end+1] ){
            dfs(s, start, end+1, vis);
        }
        if(end < s.length() -1 && !vis[start+1][end+1] ){
            dfs(s, start+1, end+1, vis);
        }
        
      
    }    
    
    
    
    
    
    
    
    public boolean isPalindromic(String s){
        
        int low = 0;
        int high = s.length()-1;
        
        while(low <= high){
            if(s.charAt(low)!= s.charAt(high)){
                return false;
            }
            
            high--;
            low++;
        }
        return true;
    }
    
    
        
}