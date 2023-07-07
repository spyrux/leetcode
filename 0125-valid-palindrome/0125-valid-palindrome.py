class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        left = 0
        right = len(s) -1 

        
        while(left < right):
            
            if (s[right].isalpha() or s[right].isnumeric()) and (s[left].isalpha() or s[left].isnumeric()):
                if s[right].lower() != s[left].lower():
                    
                    return False
                else:
                    right-=1
                    left+=1
            
            
            if not (s[left].isalpha() or s[left].isnumeric()):
                left+=1
            
            if not (s[right].isalpha() or s[right].isnumeric()):
                right-=1
            
            
            
        return True
        