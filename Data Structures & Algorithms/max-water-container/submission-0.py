class Solution:
    def maxArea(self, heights: List[int]) -> int:
        res,st,end=0,0,len(heights)-1
        while st<end:
            left, right = heights[st], heights[end]
            if left< right:
                res = max(res, left * (end-st))
                st+=1
            else:
                res = max(res, right* (end-st))
                end-=1
        
        return res