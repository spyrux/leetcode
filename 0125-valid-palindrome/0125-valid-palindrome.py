class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        left = 0
        right = len(s) -1 
        a = s.lower()
        
        while(left <= right):
            
            if a[right].isalnum() and a[left].isalnum():
                if a[right] != a[left]:
                   
                    return False
                else:
                    right-=1
                    left+=1
            
            
            elif not a[left].isalnum():
                left+=1
            
            elif not a[right].isalnum():
                right-=1
            
            
            
        return True
        