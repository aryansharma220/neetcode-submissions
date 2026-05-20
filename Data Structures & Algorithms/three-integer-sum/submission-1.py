class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        for i in range(0,len(nums)-2):
            if i>0 and nums[i]==nums[i-1]: continue
            j,k=i+1, len(nums)-1
            while j<k:
                sum = nums[i]+nums[j]+nums[k]
                if sum<0: j+=1
                elif sum>0: k-=1
                else:
                    temp=[nums[i],nums[j],nums[k]]
                    res.append(temp)
                    j+=1
                    k-=1
                    while j<k and nums[j]==nums[j-1]: j+=1
                    while j<k and nums[k]==nums[k+1]: k-=1
        
        return res