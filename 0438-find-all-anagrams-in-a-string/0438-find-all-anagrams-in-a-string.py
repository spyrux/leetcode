class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
 

        if len(p) > len(s):
            return []


        
        pdict = {}
        sdict = {}
        anagrams = []
        left = 0

        right = len(p)-1
        
        for i in p:
            if i in pdict:
                pdict[i]+=1
            else:
                pdict[i] = 1
        
        for i in range(0, right+1, 1):
            
            if s[i] in sdict:
                sdict[s[i]]+=1
            else:
                sdict[s[i]] = 1
        
        
        while right <= len(s)-1 and left <= right:
            
            if sdict == pdict:
                anagrams.append(left)
            
            if sdict[s[left]]-1 == 0:
                sdict.pop(s[left])
            else:
                sdict[s[left]]-=1
            left+=1
            
            
            if right < len(s)-1:
                right+=1
            
                if s[right] in sdict:
                    sdict[s[right]]+=1
                else:
                    sdict[s[right]] = 1
        return anagrams
            
            
            
            
            
        