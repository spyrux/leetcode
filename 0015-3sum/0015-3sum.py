class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        dist = set()
        nums.sort()

        
        for i in range(0, len(nums)):
            left = i+1
            right = len(nums)-1
            while left < right:
                if nums[left]+nums[right]+nums[i] == 0:
                    dist.add((nums[i],nums[left],nums[right]))
                    right-=1
                    left+=1
                elif nums[left]+nums[right]+nums[i] > 0:
                    right-=1
                else:
                    left+=1
                
        
        return [elem for elem in dist]
                