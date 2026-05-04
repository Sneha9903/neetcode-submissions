class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashNew = {}
        for i in nums:
            if i in hashNew:
                return True
            else:
                hashNew[i] = 1
        return False