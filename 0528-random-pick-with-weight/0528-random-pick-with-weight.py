class Solution:
    
    def __init__(self, w: List[int]):
        self.total = 0
        self.ranges = []
        self.indexmap = {}
    
        for i in range(0, len(w)):
            self.ranges.append(self.total)
            self.indexmap[self.total] = i
            self.ranges.append(self.total+w[i]-1)
            self.indexmap[self.total+w[i]-1] = i
            self.total+= w[i]
        
    def pickIndex(self) -> int:
        index = randrange(self.total)
        left = 0
        right = len(self.ranges)-1

    
        while left < right:
            mid = (left+right)//2
            if self.ranges[mid] == index:
                return self.indexmap[index]
            elif self.ranges[mid] > index:
                right = mid -1
            else:
                left = mid +1
        return self.indexmap[self.ranges[left]]
        
        
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(w)
# param_1 = obj.pickIndex()