class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length() < s1.length()){
            return false;
        }
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        //default of 0 in new array
        for(int i = 0; i < s1.length();i++){
            array1[s1.charAt(i)-'a']++;
            array2[s2.charAt(i)-'a']++;
        }
        
        int matches = 0;
        
        for(int i = 0; i < array1.length;i++){
            if(array1[i]==array2[i]){
                matches++;
            }
            
        }
        int left = 0;
        int right = s1.length() - 1;
        
        for(int i = s1.length(); i < s2.length(); i++){
                if (matches == 26) {
                    return true;
                }
                array2[s2.charAt(i)-'a']++;
                
                if(array2[s2.charAt(i)-'a'] == array1[s2.charAt(i)-'a']){
                    matches++;
                }else if(array2[s2.charAt(i)-'a']  - 1== array1[s2.charAt(i)-'a']){
                    matches--;
                }
                
                int l = i - s1.length();
            
                array2[s2.charAt(l)-'a']--;
            
                if(array2[s2.charAt(l)-'a'] == array1[s2.charAt(l)-'a']){
                    matches++;
                }else if(array2[s2.charAt(l)-'a'] + 1 == array1[s2.charAt(l)-'a']){
                    matches--;
                }
                System.out.println(matches);
                
            }
                
              
                
            
        
        
        
        return (matches == 26);
    }
}