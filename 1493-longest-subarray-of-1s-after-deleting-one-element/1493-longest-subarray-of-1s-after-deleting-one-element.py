class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        
        
        n = len(nums)
        right = [0] * n
        left = [0]*n
        longest = 0
        
        for i in range(len(nums) - 1, -1, -1):
            if i == len(nums) - 1:
                right[i] = nums[i]
            else:
                if nums[i] == 0:
                    right[i] = 0
                else:
                    right[i] = right[i+1] + 1
                    
        for i in range(0, len(nums), 1):
            if i == 0:
                left[i] = nums[i]
            else:
                if nums[i] == 0:
                    left[i] = 0
                else:
                    left[i] = left[i-1] + 1
        
        
            
        for i in range(0, len(nums), 1):
            
            total = 0
            if i > 0:
                total += left[i-1]
            if i < len(nums) -1:
                total += right[i+1]
            longest = max(longest, total)
            
        
        return longest
                
                
            
                