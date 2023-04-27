class Solution {
    // for each index you check single case and double case
   
    public int numDecodings(String s) {
        
        int[] ways = new int[s.length()+1];
        
        ways[0] = 1;
        ways[1] = s.charAt(0) == '0'? 0:1;
        
        for(int i = 2; i <= s.length(); i++){
            
            int first = Integer.parseInt(s.substring(i-1, i));
            int second = Integer.parseInt(s.substring(i-2, i));
            if(first >= 1 && first <= 9){
                ways[i] += ways[i-1];
            }
            if(second >= 10 && second <= 26){
                ways[i] += ways[i-2];
            }
        }
        
       
        return ways[s.length()];
        
    }
    
   
    
    
    
    
}