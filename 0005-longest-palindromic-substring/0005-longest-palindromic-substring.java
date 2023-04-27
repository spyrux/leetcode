class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] pal = new boolean[length][length];
        int left = 0, right = 0, max = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                
                if(i == j){
                    pal[j][i] = true;
                }else {
                    if(s.charAt(i) == s.charAt(j)){
                        if(i-j == 1){
                            pal[j][i] = true;
                        }else{
                            pal[j][i] = pal[j+1][i-1];
                        }
                    }else{
                        pal[j][i] = false;
                    }

                }
                
                if(pal[j][i]){
                    if(i-j+1 > max){
                        max = i-j+1;
                        left = j;
                        right = i+1;
                    }
                }
                
            }
        }
        return s.substring(left, right);
    }
}