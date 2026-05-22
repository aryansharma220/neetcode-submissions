class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n=len(temperatures)
        st=[]
        st.append(n-1)
        minSt=[0]*n
        for i in range(n-2,-1,-1):
            while(len(st)!=0 and temperatures[st[-1]]<=temperatures[i]): st.pop();
            minSt[i] = 0 if len(st)==0 else st[-1] - i
            st.append(i)
        
        return minSt
