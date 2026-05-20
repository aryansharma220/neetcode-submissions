class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.casefold()
        st,end=0,len(s)-1
        while st<end:
            lft,rig = s[st],s[end]
            if not lft.isalnum(): st+=1
            elif not rig.isalnum(): end-=1
            else:
                if lft==rig:
                    st+=1
                    end-=1
                else: return False
        
        return True