class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        ans = []
        m = 1
        count = 0


        for i in nums:
            if i!=0:
                m*=i
            else:
                count += 1


        l=len(nums)
        if count == 0:
            for i in range(l):
                ans.append(m//nums[i])

        elif count>=2:
            for i in range(l):
                ans.append(0)
            
        else:
            for i in range(l):
                if nums[i] == 0:
                    ans.append(m)
                else:
                    ans.append(0)

        return ans