class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i in range(len(nums)):
            dict[nums[i]] = i
        list = []
        for i in range(len(nums)):
            diff = target-nums[i]
            if diff in dict and dict[diff]!= i:
                list.append(dict[diff]) 
                list.append(i)
                return list
        return []
        
        