class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        left = 0
        right = len(s) -1 
        a = s.lower()
        
        while(left < right):
            
            if (a[right].isalpha() or a[right].isnumeric()) and (a[left].isalpha() or a[left].isnumeric()):
                if a[right] != a[left]:
                    
                    return False
                else:
                    right-=1
                    left+=1
            
            
            if not (a[left].isalpha() or a[left].isnumeric()):
                left+=1
            
            if not (a[right].isalpha() or a[right].isnumeric()):
                right-=1
            
            
            
        return True
        