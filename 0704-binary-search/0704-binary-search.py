class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        left = 0
        right = len(nums)-1
        if nums[left]== target:
            return left
        if nums[right] == target:
            return right
        while left < right:
            mid = (left+right)/2
            
            if(nums[mid] == target):
                return mid
            elif nums[left] == target:
                return left
            elif nums[right] == target:
                return right
            elif nums[mid] > target:
                right = mid -1
            else:
                left = mid+1
                
            
        
        
        3
        
        
        return -1
        