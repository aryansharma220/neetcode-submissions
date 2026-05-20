class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        st,end = 0, len(nums)-1
        while st<end:
            sum = nums[st]+nums[end]
            if sum> target:
                end-=1
            elif sum<target:
                st+=1
            else:
                return [st+1,end+1]
        
        return [-1,-1]