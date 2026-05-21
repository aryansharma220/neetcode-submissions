class Solution:
    def isValid(self, s: str) -> bool:
        map={"(":")", "{":"}", "[":"]"}
        stack=[]
        for st in s:
            if st=="(" or st=="{" or st=="[":
                stack.append(st)
            else:
                if len(stack)!=0 and map[stack[-1]]==st:
                    stack.pop()
                else: return False
        
        return len(stack)==0
