class Solution {
    
    List<List<String>> palindromes;
    public List<List<String>> partition(String s) {
        
        palindromes = new ArrayList<>();
        
        dfs(s, new ArrayList<>(), 0);
        return palindromes;
    }
    
    
    public void dfs(String s, List<String> strings, int index){
       
       
        
        if(index >= s.length()){
            palindromes.add(new ArrayList<>(strings));
            return;
        }
        int start = index;
        
        while(start < s.length()){
                
            if(isPalindrome(s.substring(index, start + 1))){
                strings.add(s.substring(index, start + 1));
                dfs(s, strings, start + 1);
                strings.remove(strings.size()-1);
            }
            start++;
        }
        
        
        
    }
    
    
    
    public boolean isPalindrome(String s){
        
        if(s.isEmpty()){
            return false;
        }
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            
            start++;
            end--;
        }
        return true;
        
    }
    
    
    
    
    
    
    
}