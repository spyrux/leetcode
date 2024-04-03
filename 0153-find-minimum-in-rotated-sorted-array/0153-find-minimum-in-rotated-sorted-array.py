class Solution:
    def findMin(self, nums: List[int]) -> int:
        #if left index > right index it has been rotated
        #binary search to find the minimum
        left = 0
        right = len(nums)-1
        
        while left < right:
            mid = (left+right)//2
            if nums[mid] > nums[right]:
                #have to minimize the search space if it si bigger then it has to be the one on its left
                #if i leave without +1 it will infinitely loop at 2 elements
                left = mid +1
            else:
                right = mid
            
        
        return nums[left]
            