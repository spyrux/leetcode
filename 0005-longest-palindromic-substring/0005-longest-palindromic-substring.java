class Solution {
    
    String longest = "";
    
    public String longestPalindrome(String s) {
        if(isPalindromic(s)){
            return s;
        }
        for(int i = 0; i < s.length(); i++){
            dfs(s, i , i+1);
        }
        
        
        
        return longest;
        
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
    
    public void dfs(String s, int start, int end){
        if(end > s.length()){
            return;
        }
        if(isPalindromic(s.substring(start, end)) && s.substring(start, end).length() > longest.length()){
            longest = s.substring(start, end);
        }
        dfs(s, start, end+1);
    }
}