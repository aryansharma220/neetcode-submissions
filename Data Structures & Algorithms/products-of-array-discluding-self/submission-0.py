class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod,zeros=1,0
        for num in nums:
            if num==0:
                zeros+=1
            else:
                prod*=num
        res=[0]*len(nums)
        if zeros==0:
            for i in range(0,len(nums)):
                res[i] = prod//nums[i]
        elif zeros==1:
            for i in range(0, len(nums)):
                if nums[i]==0:
                    res[i]=prod
                else:
                    res[i] =0
        # else:
        #     for i in range(0, len(nums)):
        #         res[i]=0
        return res