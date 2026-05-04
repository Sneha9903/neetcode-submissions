class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        s = {}
        n = len(nums)
        for i in range(n):
            s[nums[i]]=i
        
        for i in range(n):
            diff = target-nums[i]
            if diff in s and i!=s[diff]:
                return [i,s[diff]]
        return []