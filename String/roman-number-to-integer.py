#User function Template for python3

class Solution:
    def romanToDecimal(self, s): 
        # code here
        hashMap = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        
        ans = 0
        
        for i in range(1,len(s)):
            if hashMap[s[i]] > hashMap[s[i-1]]:
                ans -= hashMap[s[i-1]]
            else:
                ans += hashMap[s[i-1]]
        
        ans += hashMap[s[-1]]
        
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t = int(input())
    for _ in range(t):
        ob = Solution()
        S = input()
        print(ob.romanToDecimal(S))
# } Driver Code Ends