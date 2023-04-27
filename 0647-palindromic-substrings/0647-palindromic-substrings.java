class Solution {
    
   
    
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int odd = palindromes(s, i, i);
            int even  = palindromes(s, i, i+1);
            count += odd;
            count += even;
        }
        
        return count;
        
    }
    
    public int palindromes(String s, int start, int end){
        int amount = 0;
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            amount++;
            start--;
            end++;
        }
        
        return amount;
    }
}