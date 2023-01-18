class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] array = new int[26];
        //default of 0 in new array
        
        if(s2.length() < s1.length()){
            return false;
        }
        
        for(int i = 0; i < s1.length();i++){
            array[s1.charAt(i)-'a']++;
            array[s2.charAt(i)-'a']--;
        }
        
        int matches = 0;
        
        for(int i = 0; i < array.length;i++){
            if(array[i] == 0){
                matches++;
            }
            
        }
        
        if(matches == 26){
            return true;
        }
        
        for(int i = s1.length(); i < s2.length(); i++){
            
                array[s2.charAt(i)-'a']--;
                
                if(array[s2.charAt(i)-'a'] == 0){
                    matches++;
                }else if(array[s2.charAt(i)-'a'] == -1){
                    matches--;
                }
                
                int l = i - s1.length();
            
                array[s2.charAt(l)-'a']++;
            
                if(array[s2.charAt(l)-'a'] == 0){
                    matches++;
                }else if(array[s2.charAt(l)-'a'] == 1){
                    matches--;
                }
            
                if (matches == 26) {
                return true;
            }
                
              
                
            }
        

            
        
        
        
        
        return (matches == 26);
    }
}