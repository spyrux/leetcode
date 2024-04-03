class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for i in nums:
            seen.add(i)
        
        print(len(seen), len(nums))
        return (len(seen) != len(nums))